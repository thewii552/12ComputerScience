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
import TerminalIO.KeyboardReader;
import BreezySwing.Format;

public class PowersChart {
    public static void main (String args[]){
        KeyboardReader kb = new KeyboardReader();
        int powers=0;
        //Prompt for powers
        do{
            powers = kb.readInt();
        }while (powers<0||powers>10);
        for (int x = 0; x < powers; x++){
            
        }
    }

}
