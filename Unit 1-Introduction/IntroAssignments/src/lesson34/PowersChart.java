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
            powers = kb.readInt("Please enter a final power from 0-10:" );
        }while (powers<0||powers>10);
//Display the title
System.out.println(Format.justify('r',"X",4)+Format.justify('r',"2^X",5));
System.out.println("=============");
        for (int x = 0; x <= powers; x++){ //Display the list of powers
          System.out.println(Format.justify('r',x,4)+Format.justify('l',"",3)+Format.justify('l',Math.pow(2,x),7,0));
  
        }
    }

}
