package lesson34;

/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
import TerminalIO.KeyboardReader;
import java.text.NumberFormat;

public class EmployeePay {

    public static NumberFormat formatter = NumberFormat.getCurrencyInstance();
    public static KeyboardReader reader = new KeyboardReader();
    //5 employees--------------[employee][hours, regular, overtime]
    public static double employee[][] = new double[5][3];

    public static void main(String args[]) {
        getHours();
        //Calculate everybody's pay
        for (int x = 0; x < 5; x++) {
            calcPay(x);
        }
        showPay();
        showTotal();

    }
    public static void showTotal(){
        double overtime=0, regular=0;
        //Run through employees and add up pay
        for (int x = 0; x < 5; x++){
            regular+=employee[x][1];
            overtime+=employee[x][2];
        }
        //Display results
        
        System.out.println("======================");
        System.out.println("Total standard pay: "+formatter.format(regular));
        System.out.println("Total overtime pay: "+formatter.format(overtime));
        System.out.println("Grand Total: "+formatter.format(regular+overtime));
    }

    public static void showPay() {
        System.out.println("\n\n\n\t     HOURS WORKED\tREGULAR PAY\tOVERTIME PAY\tTOTAL");

        for (int x = 0; x < 5; x++) {
            System.out.print("Employee " + (x + 1) + ":\t");
            System.out.print(employee[x][0]+"\t\t");
            System.out.print(formatter.format(employee[x][1])+"\t\t");
            System.out.print(formatter.format(employee[x][2])+"\t\t");
            System.out.println(formatter.format(employee[x][1]+employee[x][2])+"");

        }
    }

    public static void calcPay(int empNum) {
        //Determine if they worked overtime and calculate accordingly
        if (employee[empNum][0] > 40) { //They worked overtime
            employee[empNum][1] = 40 * 15; //40 hours of regular pay
            employee[empNum][2] = (employee[empNum][0] - 40) * 22.5; //Calculate time and a half overtime
        } else { //regular pay
            employee[empNum][1] = employee[empNum][0] * 15;
            employee[empNum][2] = 0; //No overtime
        }
    }

    public static void getHours() {
        //Get hours for 5 employees
        for (int x = 0; x < 5; x++) {
            //Trap the user in a loop to make sure the data is good
            double hours;
            do {
                hours = reader.readDouble("Enter hours worked (0-70) for employee " + (x + 1) + ": ");
            } while (hours < 0 || hours > 70);
            employee[x][0] = hours;
        }
    }

}
