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

import JIRC.core.ConnectionHandler;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageHandler extends ConnectionHandler {

    public MessageHandler(PrintWriter pw, BufferedReader i, BlockingQueue bq) {
        super(pw, i, bq);
    }

    @Override
    public void run() {
        System.out.println("Running the message handler");
        while (true) {
            try {
                //Check if there are messages to be read in
                if (in.ready()) {
                    getMessages();
                }

                //If there are messages to be pushed, do so!
                if (!messageQueue.isEmpty()) {
                    pushMessages();
                }
            } catch (IOException ex) {
                Logger.getLogger(MessageHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void getMessages() throws IOException {
        while (in.ready()) {
            //add new messages to the queue
            messageQueue.add(in.readLine());
        }
    }

    private void pushMessages() {
        //Push all the messages which remain in the queue
        while (!messageQueue.isEmpty()) {
            out.println(messageQueue.remove());
        }
    }

}
