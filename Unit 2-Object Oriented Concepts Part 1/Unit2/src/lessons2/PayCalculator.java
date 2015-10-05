/*
   ____  ____   ___    ____     ___ __    __      _      ____  ______ 
  /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package lessons2;

import hsa.Console;


public class PayCalculator {
    
    public static void main (String args[]){
        Console c = new Console();
        Employee e = new Employee();
        int type;
        while (true){
            c.print("Enter type. ");
            c.print(e.getTypeRules()+"-> ");
            type = c.readInt();
            if (e.setType(type)) break;
            else c.println("Error, try again");
    }
        c.println("More to come later");
    }
}
