/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package projects;

public class Student {

    //First step: fields
    private String name;
    private int mark[] = new int[3];

    //Constructor method
    public Student() {
        this("unknown", 0, 0, 0);

    }

    public Student(String n, int a, int b, int c) {
        name = n;
        mark[0] = a;
        mark[1] = b;
        mark[2] = c;
    }

    public Student(String n, int[] m) {
        mark = m;
        name = n;
    }

    public Student(Student other) {
        this(other.name, other.mark[0], other.mark[1], other.mark[2]);

    }

    //Next, define methods
    public void setName(String n) {
        name = n;

    }

    public String getName() {
        return name;
    }

    public void setMark(int which, int score) {
        mark[which] = score;
    }

    public int getMark(int which) {
        return mark[which];
    }

    public int getAverage() {
        return (mark[0] + mark[1] + mark[2]) / 3;
    }

    public int getHighScore() {
        return Math.max(mark[0], (Math.max(mark[1], mark[2])));
    }

    public boolean[] checkData() {
        boolean dataOut[] = new boolean[4];        //Name can't be too short
        dataOut[0] = (name.length() <= 1);
        //Marks must be valid
        for (int x = 0; x < 3; x++) {
            dataOut[x + 1] = (mark[x] < 0 || mark[x] > 100);
        }

        return dataOut;

    }

    public String validate() {
        String error = "";
        if (name.length() < 2) {//Name is not valid
            error = "Name is not valid";
        }
        if (mark[0] < 0 || mark[0] > 100 || mark[1] < 0 || mark[1] > 100 || mark[2] < 0 || mark[2] > 100) {//Mark is not valid
            if ("".equals(error)) {
                error = "At least one mark is not valid";
            } else {
                error += "\nAt least one mark is not valid";
            }
        }
        if (!error.equals("")) {
            error += "\nPlease re-enter all data";
        }
        return error;
    }

    @Override
    public String toString() {
        String s = "Name:\t" + name;
        s += "\nMark 1:\t" + mark[0];
        s += "\nMark 2:\t" + mark[1];
        s += "\nMark 3:\t" + mark[2];
        return s;
    }

}
