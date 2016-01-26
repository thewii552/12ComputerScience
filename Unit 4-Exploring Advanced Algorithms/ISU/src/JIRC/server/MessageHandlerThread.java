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

import static JIRC.server.ConnectionHandler.pinging;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageHandlerThread extends Thread {

    final ConnectionHandler mh;

    public MessageHandlerThread(MessageHandler m) {
        mh = m;
    }

    public void run() {
        System.out.println("Started message handler thread");
        while (true) {
            synchronized (mh) {
                while (true) {

                    try {

                        //Is the pinger thread running? if so, wait!
                        if (pinging) {
                            System.out.println("Pinging, so I'm a waiting!");
                            mh.sleep(500);
                        }
                        System.out.println("Not pinging, so run!");

                        //Check if there are messages to be read in
                        if (mh.in.ready()) {
                            ((MessageHandler) mh).getMessages();
                        }

                        //If there are messages to be pushed, do so!
                        if (!mh.messageQueue.isEmpty()) {
                            ((MessageHandler) mh).pushMessages();
                        }
                    } catch (IOException | InterruptedException ex) {
                        Logger.getLogger(MessageHandler.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }

    }
}
