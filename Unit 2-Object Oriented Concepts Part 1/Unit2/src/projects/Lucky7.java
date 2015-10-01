/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package projects;

import TerminalIO.KeyboardReader;

public class Lucky7 {

    public static KeyboardReader kb = new KeyboardReader();

    public static void main(String args[]) {
        //Create the dice
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        //Get the starting value
        int money = kb.readInt("How many dollars do you have? ");
        int max = money; //Store the starting value as the maximum
        int rolls = 0, maxRoll=0;
        //Run the game
        do {
            //Roll the dice
            die1.roll();
            die2.roll();
            rolls++;
            if (die1.getNumber() + die2.getNumber() == 7) { //They get $4
                money += 4;
            } else { //Lose a dollar
                money--;
            }
            //See if this is a maximum
            if (money>max){
                max=money;
                maxRoll=rolls;
            }
        } while (money > 0);
        
        //Tell the user the results
        
        System.out.println("You are broke after "+rolls+" rolls");
        System.out.println("You should have quit after "+maxRoll+" rolls when you had $"+max);
        

    }

}
