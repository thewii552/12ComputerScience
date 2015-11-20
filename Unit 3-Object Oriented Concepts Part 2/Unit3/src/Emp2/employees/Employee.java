/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Emp2.employees;

public abstract class Employee {

    protected double rate, hours, totalPay;
    public static double LOW_RATE=6.75, HIGH_RATE=30.50, LOW_HOURS=1, HIGH_HOURS=60;
    protected String name;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

       public abstract double getPay();
    
    public final boolean setRate(double r) {
        boolean rateOK = r >= 6.25 && r <= 30;
        if (rateOK) {
            rate = r;
            return true;
        } else {
            return false;
        }
    }
    
    public final void addPay(){
        totalPay += getPay();
    }
    

    public final boolean setHours(double h) {
        boolean hoursOK = h >= 1 && h <= 60;
        if (hoursOK) {
            hours = h;
            return true;
        } else {
            return false;
        }

    }

    public final boolean setName(String n) {
        if (n.length() > 0) {
            name = n;
            return true;
        } else {
            return false;
        }
    }

    
    public final String getName() {
        return name;
    }
    
    public static final String getNameRules() {
        return "Name (must not be blank): ";
    }

    public static final String getHourRules() {
        return "Hours (must be from 1 to 60): ";
    }

    public static final String getRateRules() {
        return "Rate (must be from 6.75 to 30.75): ";
    }


    

}
