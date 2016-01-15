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

public class TireSales {

    public static void main(String[] args) {
        ArrayStack pole = new ArrayStack();
        System.out.println("Just got 2 Goodyear tires");
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        System.out.println("Next tire to sell: " + pole.peekTop());
        System.out.println("Just bought 4 Cooper tires");
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        System.out.println("Sold 2 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
    }

    public static void showInventory(ArrayStack p) {

    }

}
