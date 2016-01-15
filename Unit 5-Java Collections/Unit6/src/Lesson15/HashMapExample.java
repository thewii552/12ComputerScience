/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Lesson15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String args[]) {
        HashMap<String, String> prov = new HashMap();
        prov.put("ON", "Toronto");
        prov.put("MB", "Winnipeg");
        prov.put("SK", "Regina");
        prov.put("AB", "Edmonton");
        prov.put("BC", "Vancouver");
        prov.put("BC", "Victoria");
        System.out.println(prov);
        prov.remove("ON");
        System.out.println("The capital of British Columbia is " + prov.get("BC"));
        Iterator it = prov.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Map.Entry<String, String> entry : prov.entrySet()) {
            String string = entry.getKey();
            String string1 = entry.getValue();

            System.out.println("The capital of " + string + " is " + string1);

        }

    }
}
