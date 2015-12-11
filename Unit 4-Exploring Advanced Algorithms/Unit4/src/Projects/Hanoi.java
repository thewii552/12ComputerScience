/*
   ____  ____   ___    ____     ___ __    __      _      ____  ______ 
  /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Projects;

import TerminalIO.KeyboardReader;


public class Hanoi {
    public static int moves = 0;
    public static void main (String args[]){
        KeyboardReader kb = new KeyboardReader();
        int numRings = kb.readInt("Enter number of rings (3-10): ");
        if (numRings < 3 || numRings > 10){
            System.out.println("Invalid input. Number must be 3=10");
            return;
        }
        move (numRings, 1,3,2);
        System.out.println("Solved in "+moves + " moves");
    }
    
    public static void move (int n, int i, int j, int k){
        //Zero rings? Stop!
        if (n > 0){
            moves ++;
            move (n-1, i, k, j); //Call move recursively
            System.out.println("Move ring "+n+" from peg "+i+" to peg "+j);
            move (n-1, k,j,i);
        }
    }

}
