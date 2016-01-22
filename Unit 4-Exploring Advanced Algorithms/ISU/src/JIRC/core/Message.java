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

public class Message {

    private final String sender, message;

    //create a message which is already processed into sender and message
    public Message(String s, String m) {
        sender = s;
        message = m;
    }

    //Create a message from raw data
    //Format is "MSG*USERNAME**USR**Message Data"
    public Message(String d) {
        //Start by taking off the MSG* prefix
        d = d.substring(3);
        //Find the index of the message start
        int messageStart = d.indexOf("**USR**");
        //Set the sender
        sender = d.substring(0, messageStart);
        //Set the message
        message = d.substring(messageStart + 7);
    }

    public String getSender() {
        return sender;
    }


    public String getMessage() {
        return message;
    }
    

    
    
}
