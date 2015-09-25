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
        KeyboardReader kb = new KeyboardReader();
        int numStudents = kb.readInt("Enter number of students: ");
        //Array of students
        Student students[] = new Student[numStudents];

        //Get names for students
        for (int x = 0; x < numStudents; x++) {
            students[x] = new Student();
            students[x].setName(kb.readLine("Enter name of student " + (x + 1) + ": "));
        }

        //Get scores
        for (Student stu : students) {
            for (int x = 0; x < 3; x++) {
                //Run through the three marks
                //Trap the user in a loop to ensure a valid input
                while (true) {
                    int mark = kb.readInt("Enter mark " + (x + 1) + " for " + stu.getName() + ": ");
                    stu.setMark(x, mark);
                    //Check if the mark is good
                    if (mark >= 0 && mark <= 100) {
                        break;
                    }
                    //If not, give an error
                    System.err.println("Please enter a valid mark from 0-100");

                }
            }
        }
        
        //Display information
        for (Student stu:students){
            System.out.println("\n"+stu);
        }
    }

}
