/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
   

 ----Ask for size and number of toppings----
 •All pizzas cost a base price of $1.50 for labor 
 •Another base cost is utilities (oven heat) of $0.75
 •Toppings cost $0.75 each
 •The base ingredients (cheese, dough sauce) are $0.50 multiplied by the diameter (size) 
 of the pizza 

 */
package intro;

import TerminalIO.KeyboardReader;
import java.text.NumberFormat;

public class Pizza {

    public static void main(String args[]) {
        //Create a keyboardreader
        KeyboardReader reader = new KeyboardReader();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        //variables to hold input
        int diameter, toppings;

        //Prompt user
        System.out.print("Enter size of pizza (in inches): ");
        diameter = reader.readInt();
        System.out.print("Enter number of toppings: ");
        toppings = reader.readInt();
        System.out.println("***************************************\n");
        System.out.println("Base cost: " + formatter.format(2.25 + 0.5 * diameter));
        System.out.println("Topping cost: " + formatter.format(toppings * 0.75));
        System.out.println("Total cost: " + formatter.format(2.25 + 0.5 * diameter + toppings * 0.75));

    }

}
