/*
   ____  ____   ___    ____     ___ __    __      _      ____  ______ 
  /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */

import hsa.*;
public class Day1 {
    public static Console c = new Console();
    
    public static void main (String args[]){
        
//        c.print("Hello World!");
        int age;
        c.print("HOW OLD ARE YOU?!?!?!?!?!?!?!?!? ");
        age = c.readInt();
        c.println("NEXT YEAR YOU WILL BE "+(age++)+", STUPIDHEAD");
        
        c.drawMapleLeaf(100, 100, 100, 100);
    }
    
}
