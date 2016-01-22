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

//This is the main chat server.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Server {

    public static int portNumber = 25565;
    static ServerSocket serverSocket;
    static Socket clientSocket;
    static PrintWriter out;
    static BufferedReader in;

    private static BlockingQueue messageQueue;

    static PingHandler pinger;
    static MessageHandler messager;

    public static void main(String args[]) {
        messageQueue = new LinkedBlockingQueue();
        init();
        pinger = new PingHandler(out, in, messageQueue);
        messager = new MessageHandler(out, in, messageQueue);
        //Start the ping handler thread
        (new Thread(pinger)).start();

        //Start the message handler thread
        (new Thread(messager)).start();
    }

    public static void init() {

        //the network stuff
        try {

            System.out.println("network started");
            serverSocket = new ServerSocket(portNumber);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("network complete");

    }

    public void close() {
        try {
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {

        }
    }
}
