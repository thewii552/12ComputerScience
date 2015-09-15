/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package introAssignments;

import TurtleGraphics.*;
import hsa.*;

public class Graph {
    public static int num1, num2, num3, num4;
    public static Console c = new Console();

    public static void main(String args[]) {
        //Read all the values
        c.print("Enter first number (1-200): ");
        num1 = c.readInt();
        c.print("Enter second number (1-200): ");
        num2 = c.readInt();
        c.print("Enter third number (1-200): ");
        num3 = c.readInt();
        c.print("Enter fourth number (1-200): ");
        num4 = c.readInt();
        //Close the console
        c.close();
        //Create the window for drawing
        SketchPadWindow win = new SketchPadWindow(400, 400);
        Pen p = new StandardPen(win);
        p.up();
        p.setWidth(40);
        
        //First
        p.move (-150,-200);
        p.down();
        p.move (-150, -200+num1);
        p.up();
        p.move (-160, -170+num1);
        p.drawString(Integer.toString(num1));
        
        //Second
        p.move (-50,-200);
        p.down();
        p.move (-50, -200+num2);
        p.up();
        p.move (-60, -170+num2);
        p.drawString(Integer.toString(num2));
        
        //Third
        p.move (50,-200);
        p.down();
        p.move (50, -200+num3);
        p.up();
        p.move (40, -170+num3);
        p.drawString(Integer.toString(num3));
        
        //Fourth
        p.move (150,-200);
        p.down();
        p.move (150, -200+num4);
        p.up();
        p.move (140, -170+num4);
        p.down();
        p.drawString(Integer.toString(num4));
        

    }
}
