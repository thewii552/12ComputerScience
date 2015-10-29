/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package lessons;

import hsa.*;

public class TestRev2 {

    public static void main(String args[]) {
        Console c = new Console();
        String survey[][] = {
            {"BOB", "C"},
            {"SUE", "C"},
            {"JOE", "V"},
            {"AMY", "S"},
            {"GREG", "V"},
            {"TOM", "S"},
            {"JJ MUGGS", "C"}
        };

        String choc[] = countFlavour(survey, "C");
        String vani[] = countFlavour(survey, "V");
        String stra[] = countFlavour(survey, "S");
        
        c.println("Here are the results");
        //Print chocolate
        c.println("\nCHOCOLATE\n==========");
        for (String ch: choc){
            c.println (ch);
        }
        //Print vanilla
        c.println("\n VANILLA \n==========");
        for (String va: vani){
            c.println (va);
        }
        c.println("\nSTRAWBERRY\n==========");
        for (String st: stra){
            c.println (st);
        }
        
    }

    public static String[] countFlavour(String d[][], String f) {
        //Count how big the array which is being returned needs to be
        int count = 0;
        for (String[] d1 : d) {
            if (d1[1].equals(f)) {
                count++;
            }
        }
        //Create name array
        String names[] = new String[count];
        //Go through again and build list of names
        count = 0;
        for (String[] d1 : d) {
            if (d1[1].equals(f)) {
                names[count] = d1[0];
                count++; //Go to the next location in the names array
            }
        }
        return names;

    }
}
