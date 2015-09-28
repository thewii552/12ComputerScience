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

import TerminalIO.KeyboardReader;

public class RunStudents {

    public static void main(String arguments[]) {
        int numStudents = 0;
        KeyboardReader kb = new KeyboardReader();
        do {
            numStudents = kb.readInt("Enter number of students: ");
        } while (numStudents <= 0);
        //Array of students
        Student students[] = new Student[numStudents];

        //Get names for students
        for (int x = 0; x < numStudents; x++) {
            students[x] = new Student();
            //Lock in a loop to ensure a valid name
            while (true) {
                students[x].setName(kb.readLine("Enter name of student " + (x + 1) + ": "));
                if (!students[x].checkData()[0]) {
                    break;
                }
                System.err.println("Name must be at least two characters");
            }
        }

        //Get scores
        for (Student stu : students) {
            for (int x = 0; x < 3; x++) {
                //Run through the three marks
                int mark = kb.readInt("Enter mark " + (x + 1) + " for " + stu.getName() + ": ");
                stu.setMark(x, mark);
            }
            //Run through and check all the values
            for (int y = 1; y < 4; y++) {
                if (stu.checkData()[y]) {
                    System.err.println("Mark " + y + " is invalid. Mark must be from 0-100");
                    int mark = kb.readInt("Enter mark " + (y) + " for " + stu.getName() + ": ");
                    stu.setMark(y-1, mark);
                }
            }
        }
        
        //Display info of students
        System.out.println("-----STUDENT INFO-----");
        for(Student stu:students){
            System.out.println("\n"+stu);
        }

        //Find highest average and mark
        //Start with mark
        int maxMark = students[0].getHighScore();
        int maxAvg = students[0].getAverage();
        String maxMarkName = students[0].getName();
        String maxAvgName = students[0].getName();
        
        //See who has the highest score and store their name and score
        for (Student stu : students) {
            if (stu.getHighScore() > maxMark) {
                maxMark = stu.getHighScore();
                maxMarkName = stu.getName();
            }
        }
        
        System.out.println(maxMarkName+" has the highest mark of "+maxMark+"%");
        System.out.println(maxAvgName+" has the highest average of "+maxAvg+"%");
        
    }

}
