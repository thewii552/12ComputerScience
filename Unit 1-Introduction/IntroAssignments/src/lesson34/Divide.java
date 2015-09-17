/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package lesson34;

import TerminalIO.*;

public class Divide {

    public static void main(String args[]) {
        int num1, num2, result, remain;
        KeyboardReader kb = new KeyboardReader();
        //Get the numbers
        num1 = kb.readInt("Enter first integer: ");
        num2 = kb.readInt("Enter second integer: ");
        //Determine which number is greater and print accordingly
        if (num1 > num2) { //num1/num2
            result = num1 / num2;
            remain = num1 % num2;
            System.out.println(num1 + "/" + num2 + "=" + result + " with a remainder of " + remain);
        } else { //num2/num1
            result = num2 / num1;
            remain = num2 % num1;
            System.out.println(num2 + "/" + num1 + "=" + result + " with a remainder of " + remain);

        }

    }

}
