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

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageHandlerThread extends Thread {

     ConnectionHandler mh;

    public MessageHandlerThread(MessageHandler m) {
        mh = m;
    }

    public void run() {
        System.out.println("Started message handler thread");
        while (true) {
                while (true) {

                    try {

                        
                        //Check if there are messages to be read in
                        if (mh.in.ready()) {
                            ((MessageHandler) mh).getMessages();
                        }

                        //If there are messages to be pushed, do so!
                        if (!mh.messageQueue.isEmpty()) {
                            ((MessageHandler) mh).pushMessages();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(MessageHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            
        }

    }
}
