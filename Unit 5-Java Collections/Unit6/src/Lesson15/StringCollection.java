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

import java.util.HashSet;
import java.util.Iterator;

public class StringCollection {

    public static void main(String[] args) {
        HashSet<String> x = new HashSet();
        x.add("Bob");
        x.add("Charlie");
        x.add("Sam");
        x.add("Jamal");
        System.out.println(x);
        x.remove("Sam");
        System.out.println("There are " + x.size() + " people left");
        System.out.println("Removing all people");
        Iterator it = x.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
    }

}
