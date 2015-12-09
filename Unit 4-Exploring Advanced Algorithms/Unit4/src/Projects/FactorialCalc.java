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

import TerminalIO.*;

public class FactorialCalc {

    public static void main(String args[]) {
        KeyboardReader kb = new KeyboardReader();
        int num = kb.readInt("Enter 1-20 to calculate factorial: ");
        if (num > 0 && num < 28) {
            System.out.println("The factorial of " + num + " is: " + factorial(num));
        }else{
            System.out.println("Please enter a valid number");
        }
        
       

    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1l;
        } else {
            return n * factorial(n - 1);
        }
    }

}
