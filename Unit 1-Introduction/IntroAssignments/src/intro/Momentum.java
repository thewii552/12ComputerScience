/*
   ____  ____   ___    ____     ___ __    __      _      ____  ______ 
  /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  

This is a simple console program which calculates momentum
                                                                    
 */
package intro;

import TerminalIO.KeyboardReader;


public class Momentum {
    
    public static void main (String args[]){
        //Create the keyboard reader object
        KeyboardReader reader = new KeyboardReader();
        //Initialize the variables
        double mass, velocity;
        
        //Prompt the user
        System.out.print("Enter mass in kg: ");
        mass = reader.readDouble();
        System.out.print("Enter velocity in m/s: ");
        velocity=reader.readDouble();
        //Calculate and display the momentum
        System.out.println("The momentum is "+(velocity*mass)+" N/s");
        
    }

}
