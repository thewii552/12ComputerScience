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
//(lazy) imports

import TurtleGraphics.*;
import hsa.*;

//This is a simple program which will draw a line using TurtleGraphics
public class MakeLine {

    public static int x1, x2, y1, y2;
    public static Console c = new Console();

    public static void main(String args[]) {
        //Read all the values
        c.print("Enter x1: ");
        x1 = c.readInt();
        c.print("Enter y1: ");
        y1 = c.readInt();
        c.print("Enter x2: ");
        x2 = c.readInt();
        c.print("Enter y2: ");
        y2 = c.readInt();
        //Close the console
        c.close();
        //Create the window for drawing
        SketchPadWindow win = new SketchPadWindow(400, 400);
        Pen p = new StandardPen(win);
        p.up();
        //Draw the line
        p.move(x1-190,-y1+200);
        p.drawString("("+x1+", "+x2+")");
        p.move(x1-200,-y1+200);
        p.down();
        p.move(x2-200,-y2+200);
        p.up();
        p.move(x2-190,-y2+200);
        p.drawString("("+x2+", "+y2+")");
        
        
     
        
    }

 

}
