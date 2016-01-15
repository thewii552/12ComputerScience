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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PokeMap {

    //static HashMap<String, HashSet> pm = new HashMap();
    public static void main(String[] args) {
        HashMap<String, HashSet> pm = new HashMap();
        pm.put("Electric", new HashSet<Pokemon>());
        pm.put("Plant", new HashSet<Pokemon>());
        pm.put("Fire", new HashSet<Pokemon>());
        pm.put("Water", new HashSet<Pokemon>());

        //Add pikachu to electric
        pm.get("Electric").add(new Pokemon(25, "Pikachu"));
        pm.get("Electric").add(new Pokemon(26, "Riachu"));
        pm.get("Water").add(new Pokemon(6, "Squirtle"));
        pm.get("Water").add(new Pokemon(12, "Blastoise"));
        pm.get("Fire").add(new Pokemon(7, "Charizard"));

        System.out.println(pm);
        Iterator it = pm.get("Water").iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Types:");
        for (Map.Entry<String, HashSet> entry : pm.entrySet()) {
            String type = entry.getKey();
            System.out.print(type + ", ");
        }
        System.out.println("Remove Blastoise");
        pm.get("Fire").remove(new Pokemon(7, "Charizard"));

//        pm.put("Electric", new Pokemon(25, "Pikachu"));
//        pm.put("Plant", new Pokemon(1, "Bulbasaur"));
//        pm.put("Fire", new Pokemon(7, "Charizard"));
//        pm.put("Water", new Pokemon(6, "Squirtle"));
//        System.out.println(pm);
    }
}
