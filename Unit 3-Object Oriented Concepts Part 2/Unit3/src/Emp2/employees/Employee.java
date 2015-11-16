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

    protected double rate, hours;
    protected String name;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
    }

    
    public boolean setRate(double r) {
        boolean rateOK = r >= 6.25 && r <= 30;
        if (rateOK) {
            rate = r;
            return true;
        } else {
            return false;
        }

    }

    public boolean setHours(double h) {
        boolean hoursOK = h >= 6.25 && h <= 60;
        if (hoursOK) {
            hours = h;
            return true;
        } else {
            return false;
        }

    }

    public boolean setName(String n) {
        if (n.length() > 0) {
            name = n;
            return true;
        } else {
            return false;
        }
    }

    
    public String getName() {
        return name;
    }

    public abstract double getPay();

}
