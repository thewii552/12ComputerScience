/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Projects;



public class Player implements Comparable {

    private String name, team, position;
    private double salary, weight;
    

    public Player(String n, String t, String p, double s, double w) {
        name = n;
        team = t;
        position = p;
        salary = s;
        weight = w;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n.replace("-", " ");
    }

    @Override
    public String toString() {
       
        String out= "Name: "+name;
        out +="\n============================";
        out +="\nTeam: "+team;
        out +="\nPosition: "+position;
        out +="\nSalary: $"+salary;
        out +="\nWeight: "+weight+" lbs";
        return out;
    }

    @Override
    public int compareTo(Object o) {
        return name.compareTo(((Player)o).getName());
    }

}
