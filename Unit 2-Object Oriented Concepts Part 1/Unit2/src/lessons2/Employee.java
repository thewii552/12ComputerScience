/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package lessons2;

public class Employee {

    private int type;
    private double rate, hours;
    private String name;

    public Employee() {
        name = "";
        rate = 0;
        hours = 0;
        type = 0;
    }

    public boolean setType(int t) {
        if (t < 1 || t > 2) {
            return false;
        } else {
            type = t;
            return true;
        }

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
            rate = h;
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

    public String getNameRules() {
        return "Name must not be blank";
    }

    public String getHourRules() {
        return "Hours must be from 1 to 60";
    }

    public String getRateRules() {
        return "Rate must be from 6.75 to 30.75";
    }

    public String getTypeRules() {
        return "Type must be 1 or 2";

    }

    public String getName() {
        return name;
    }

    public double getPay() {
        if (type == 2) {
            return rate * hours;
        } else if (hours <= 40) {
            return rate * hours;
        } else {
            return (rate * 40) + (hours - 40) * rate * 2;
        }

    }

}
