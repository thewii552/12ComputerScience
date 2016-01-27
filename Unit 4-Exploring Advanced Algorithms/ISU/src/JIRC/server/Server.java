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

    //Variables needed for operation
    public static int portNumber = 25565;
    static ServerSocket serverSocket;
    static Socket clientSocket;
    static PrintWriter out;
    static BufferedReader in;
    static String name= "Andrew";

    //Queue to hold messages
    private static LinkedBlockingQueue messageQueue, inQueue;

    //Threads to handle pinging connected users and moving messages
    static MessageHandler messager;

    public Server(LinkedBlockingQueue mq,LinkedBlockingQueue iq, int port) {
        //initialize everything
        inQueue = iq;
        messageQueue = mq;
        portNumber = port;
        init();

        

        //Create the message handler thread
        ConnectionHandler message = new MessageHandler(out, in, messageQueue, inQueue);
        MessageHandlerThread messageThread = new MessageHandlerThread((MessageHandler) message);
        //Start the ping thread
        //Start the message thread
        messageThread.start();

        
    }

    public static void init() {

        //the network stuff
        try {

            System.out.println("network started");
            //Set up sockets and buffered IO
            serverSocket = new ServerSocket(portNumber);
            clientSocket = serverSocket.accept();
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));
            
            //Send out the username
            out.println(name);
            in.readLine();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("network complete");

    }

    public void close() {   //method to close all the connections and readers/writers
        try {
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {

        }
    }
}
