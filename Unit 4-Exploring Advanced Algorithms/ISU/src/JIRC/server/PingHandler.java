/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package JIRC.server;

import JIRC.core.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;

public class PingHandler extends ConnectionHandler {

    protected HashSet<User> users = new HashSet();
    ConnectionHandler pinger;

    public PingHandler(PrintWriter pw, BufferedReader i, BlockingQueue bq) {
        super(pw, i, bq);
    }

   /* @Override
    public void run() {
        while (true) {
            try {
                //Notify the other 
                //Ping everybody
                ping();
                
            } catch (InterruptedException | IOException ex) {
                System.out.println(ex);
            }
        }
    }*/

    public void ping() throws InterruptedException, IOException {
        pinging=true;
        System.out.println("ping");
        //Ping all the connected users
        out.println("SERV*Ping");
        //Wait for responses with names
        
        Thread.sleep(3000);
        
        //Create a temporary list for connected users
        HashSet<User> temp = new HashSet();

        while (in.ready()) {
            //Get the name of connected users
            String tempuser = in.readLine();
            //Is it accidentially a message? Add it to the message queue
            if (tempuser.contains("MSG*")) {
                messageQueue.add(tempuser);
            } else { //It's a person, add them to the list
                System.out.println(tempuser);
                temp.add(new User(tempuser));
            }
        }

        if (!users.toString().equals(temp.toString())) { //there's a change in the user list; update that!
            users = temp;
            //Push the update to all connected users
            sendList();
        }
        
        pinging = false;
    }

    public void sendList() {
        //Send a notification of incoming user list, and then send the list
        out.println("SERV*List");
        for (User u : users) {
            out.println(u);
        }
    }

}
