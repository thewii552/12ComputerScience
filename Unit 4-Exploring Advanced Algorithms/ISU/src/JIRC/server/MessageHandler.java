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
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;


public class MessageHandler extends ConnectionHandler {
    
    LinkedBlockingQueue inQueue;
    
    public MessageHandler(PrintWriter pw, BufferedReader i, LinkedBlockingQueue oq, LinkedBlockingQueue iq) {
        super(pw, i, oq);
        inQueue = iq;
        inQueue.add("This is a test");
    }

    void getMessages() throws IOException {        
        while (in.ready()) {
            //add new messages to the queue
            inQueue.add(in.readLine());
        }
    }

    void pushMessages() {
        //Push all the messages which remain in the queue
        while (!messageQueue.isEmpty()) {
            System.out.println("Pushing Messages");
            out.println(messageQueue.remove());
        }
    }

}
