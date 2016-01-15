/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Lessons;

public class RadioShow {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String args[]) {

        //create a "phone line" queue
        LinkedQueue phoneLine = new LinkedQueue();
        System.out.println("Our lines are open");
        System.out.println("We currently have " + ANSI_RED + phoneLine.size() + ANSI_RESET + " callers in line");

        System.out.println(ANSI_BLUE + "**ADDING CALLERS**" + ANSI_RESET);
        phoneLine.enqueue(new Caller("Steve"));
        phoneLine.enqueue(new Caller("Jamal"));
        phoneLine.enqueue(new Caller("Bob"));
        System.out.println("Next " + phoneLine.peekFront());
        System.out.println("We are now talking to: " + phoneLine.dequeue());
        System.out.println(ANSI_PURPLE + "Let's take the next caller..." + ANSI_RESET);
        System.out.println("We are now talking to " + phoneLine.dequeue());
    }

}
