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

public class MakeStudents {

    public static void main(String args[]) {
        Student x = new Student();
        x.setName("Jerry Guo");
        x.setMark(1, 45);
        x.setMark(2, 32);
        x.setMark(3, 99);
        System.out.println(x);

        Student y, z;
        y = new Student("Steve", 67, 78, 83);
        System.out.println(y.getName() + "'s average is " + y.getAverage());
        z = new Student(y);
        
        System.out.println(z.getName() + "'s average is " + z.getAverage());
    }
}
