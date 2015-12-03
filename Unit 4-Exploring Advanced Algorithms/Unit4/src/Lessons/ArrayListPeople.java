/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Lessons;

import java.util.ArrayList;

public class ArrayListPeople {

    public static void main(String args[]) {
        ArrayList<People> p = new ArrayList();
        
        p.add(new People("Joe", 55));
        for (int x = 1; x <5; x++){
            int age = (int)(Math.random()*70+1);
            p.add(new People ("Person "+x,age));
        }
        
        for (int x = 0; x < p.size(); x++){
            System.out.println(p.get(x));
        }
        System.out.println("Inserting Person 6 at location 3");
        p.add(3, new People("Bob", 22));
        System.out.println("Inserting Steve at the top");
        p.add(0,new People("Steve",44));
        
        for (int x = 0; x < p.size(); x++){
            System.out.println(p.get(x));
        }
        
        System.out.println("Removing Person 4");
        p.remove(4);
    }
}
