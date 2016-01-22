package Testing;

import TerminalIO.KeyboardReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;

/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
public class TestClient {

    static URL testUrl;

    public static void main(String args[]) {
        KeyboardReader kb = new KeyboardReader();
        try {

            Socket echoSocket = new Socket("localhost", 25565);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(echoSocket.getInputStream()));

            while (true) {
                if (in.ready()) {
                    String line = in.readLine();
                    System.out.println(line);
                    if (line.equals("SERV*Ping")) {
                        out.println("Test");
                    }
                }
                String testMessage = "MSG*";
                testMessage += "Andrew**USR**";
                testMessage += kb.readLine();
                //Push the message
                out.println(testMessage);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
