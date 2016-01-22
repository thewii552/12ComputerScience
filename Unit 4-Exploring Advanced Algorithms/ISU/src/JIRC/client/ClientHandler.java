/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package JIRC.client;

//This class will pull messages and add them to the client queue, as well as push messages which are to be sent
import JIRC.core.ConnectionHandler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.LinkedBlockingQueue;

public class ClientHandler extends ConnectionHandler {

    private static LinkedBlockingQueue<String> sendQueue;
    private static LinkedBlockingQueue<String> controlQueue;

    public ClientHandler(PrintWriter pw, BufferedReader i, LinkedBlockingQueue iq, LinkedBlockingQueue sq) {
        super(pw, i, iq);
        sendQueue = sq;
    }

    private void pullMessage() throws IOException {
        //If messages are waiting, get them and put them in the appropriate queue
        while (in.ready()) {
            String messageIn = in.readLine();
            //Is it a server control message?
            if (messageIn.substring(0, 4).equals("SERV")) {
                controlQueue.add(messageIn.substring(4));

            } //is it a user message?
            else if (messageIn.substring(0, 4).contains("MSG*")) {
                messageQueue.add(messageIn);
            }
        }
    }

    private void pushMessage() {
        //Push messages from the send queue
        while (!sendQueue.isEmpty()) {
            out.println(sendQueue.remove());
        }
    }

    @Override
    public void run() {
        //Always run
        while (true) {
            try {
                //Get all the messages
                pullMessage();
                //Send out all waiting messages
                pushMessage();
            } catch (IOException ex) {
                System.out.println(ex);
            }

        }

    }

}
