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

public class PingHandlerThread extends Thread {

    final ConnectionHandler ph;

    public PingHandlerThread(PingHandler p) {
        ph = p;
    }

    public void run() {
        while (true) {
            synchronized (ph) {
                try {
                    ph.notifyAll();
                    ((PingHandler) ph).ping();
                } catch (InterruptedException ex) {
                    Logger.getLogger(PingHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PingHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }
}
