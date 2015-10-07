/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package projects2;

import TerminalIO.KeyboardReader;

public class PayCalculator {

    public static void main(String args[]) {
        KeyboardReader kb = new KeyboardReader();

        Employee e = new Employee();
        String name;
        int type;
        double rate, hours;
        String prompt;

        //Gather information
        while (true) {
            System.out.println("Enter data:");
            name = kb.readLine("Enter employee name, or enter to quit: ");
            if (!e.setName(name)) {
                break;
            }
            //Get type until it's a valid number
            do {
                prompt=e.getTypeRules();
                type = kb.readInt(prompt);
            } while (!e.setType(type));
            
            //Get pay rate until valid
            do {
                prompt = e.getRateRules();
                rate = kb.readDouble(prompt);
            } while (!e.setRate(rate));
            do {
                prompt = e.getHourRules();
                hours = kb.readDouble(prompt);
            } while (!e.setHours(hours));
        }

    }
}
