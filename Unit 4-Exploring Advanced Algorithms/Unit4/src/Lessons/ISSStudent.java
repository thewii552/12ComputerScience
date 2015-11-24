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

public class ISSStudent implements Comparable {

    private int id;
    private String name;
    private String address;

    public ISSStudent(String n, String a, int i) {
        name = n;
        address = a;
        id = i;
    }

    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        String str = "Name:\t" + name;
        str += "\nAddress:\t" + address;
        str += "\nStudent ID:\t" + id+"\n---\n";
        return str;
    }

    @Override
    public int compareTo(Object o) {
        int i = ((ISSStudent) o).getID();
        return id - i;

    }
}
