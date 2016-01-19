/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Project.Conference;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.ImageIcon;

public class Conference {

    private String name;
    private String description;
    private HashSet<Guest> people;
    private ImageIcon image;

    public Conference(String n, String d, String img) {
        name = n;
        description = d;
        image = new ImageIcon("src/Project/Conference/img/" + img);

        people = new HashSet();
    }

    public void save(PrintWriter pw, String key) {
        Iterator it = people.iterator();
        while (it.hasNext()) {
            pw.println(key);
            pw.println(it.next());
        }
    }

    public boolean signUp(Guest g) {
        return people.add(g);
    }

    public boolean remove(Guest g) {
        return people.remove(g);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public HashSet<Guest> getPeople() {
        return people;
    }

    public ImageIcon getImage() {
        return image;
    }

}
