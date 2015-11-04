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

import TurtleGraphics.*;
import java.awt.Color;

public class Drawing {

    public static SketchPadWindow win = new SketchPadWindow(800, 800);
    public static Pen p = new StandardPen(win);
    public static Shape s = new Circle(0, 0, 100);
    public static void main(String args[]) {
        
        p.down();
        s.draw(p);
        s.stretchBy(2);
        s.draw(p);
        s.stretchBy(0.5);
        p.setColor(Color.yellow);
        s.draw(p);
        System.out.println(s);
        p.setColor(Color.BLACK);
        s= new Rectangle(100, 100, 200, 180);
        s.draw(p);
        System.out.println(s);
        s= new Wheel(-100,100,100,8);
        s.draw(p);
        
    }

}
