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

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.HashSet;
import JIRC.core.*;
import java.io.IOException;

public class ConnectionHandler implements Runnable {

    PrintWriter out;
    BufferedReader in;
    HashSet<User> users = new HashSet();

    public ConnectionHandler(PrintWriter pw, BufferedReader i) {
        out = pw;
        in = i;
    }

    @Override
    public void run() {
        System.out.println("Hello from thread");
        while (true) {
            try {
                //Ping everybody
                ping();
            } catch (InterruptedException | IOException ex) {
                System.out.println(ex);
            }
        }
    }

    public void ping() throws InterruptedException, IOException {
        System.out.println("ping");
        out.println("SERV*Ping");
        Thread.sleep(1000);
        HashSet<User> temp = new HashSet();
        while (in.ready()) {
            String tempuser = in.readLine();
            System.out.println(tempuser);
            temp.add(new User(tempuser));
        }
        if (!users.toString().equals( temp.toString())) { //there's a change in the user list; update that!
            users = temp;
            sendList();
        }
    }

    public void sendList() {
        //Send a notification of incoming user list, and then send the list
        out.println("SERV*List");
        for (User u : users) {
            out.println(u);
        }
    }

}
