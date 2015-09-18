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

import BreezySwing.Format;
import java.text.NumberFormat;

public class SalaryTable {

    public static void main(String args[]) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        //variables to store salary info
        double old = 40000, raise = 0, current = 40000;
        //print the titles
        System.out.println(Format.justify('r', "YEAR", 4) + Format.justify('r', "OLD SALARY", 13) + Format.justify('r', "      RAISE   ", 15) + Format.justify('r', "NEW SALARY", 13));
        System.out.println("====   ==========     =========   ==========");
        for (int year = 0; year <= 10; year++) {
            System.out.println(Format.justify('r', year, 4)+ Format.justify('r', formatter.format(old), 13) +"     "+ Format.justify('l', formatter.format(raise), 12) + Format.justify('r', formatter.format(current), 10));
            //Adjust the variables
            old = current; 
            current *=1.03;
            raise = current-old;

        }

    }
}
