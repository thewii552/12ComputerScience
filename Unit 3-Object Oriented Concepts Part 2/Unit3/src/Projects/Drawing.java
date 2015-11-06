/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Projects;

import Projects.shapes.*;

import TurtleGraphics.*;
import java.awt.Color;

public class Drawing {

    public static SketchPadWindow win = new SketchPadWindow(800, 800);
    public static Pen p = new WiggleRainbowPen(win);
    public static Shape s = new Wheel();
    public static void main(String args[]) {
        s.stretchBy(3);
       p.setWidth(100);
        s.draw(p);
        
        
        
        
    }

}
