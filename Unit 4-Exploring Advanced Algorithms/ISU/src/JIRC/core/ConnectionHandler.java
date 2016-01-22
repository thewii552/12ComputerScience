/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package JIRC.core;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public abstract class ConnectionHandler implements Runnable {

    protected PrintWriter out;
    protected BufferedReader in;
    protected BlockingQueue<String> messageQueue;

    public ConnectionHandler(PrintWriter pw, BufferedReader i, BlockingQueue bq) {
        out = pw;
        in = i;
        messageQueue = bq;
    }

}
