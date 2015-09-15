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

public class DrawCircle {

    public static SketchPadWindow win = new SketchPadWindow(400, 400);
    public static Pen p = new StandardPen(win);

    public static void main(String args[]) {
        for (int x = 1; x < 160; x += 5) {
            drawCircle(x);
        }

    }

    public static void drawCircle(int radius) {
        p.up();
        p.home();
        p.setDirection(180);
        p.move(radius);
        p.down();
        //Determine step length
        double step = 0.06283185307 * radius;
        p.setDirection(90);
        for (int x = 0; x < 100; x++) {
            p.move(step);
            p.turn(-3.6);
        }
    }
}
