/*
   ____  ____   ___    ____     ___ __    __      _      ____  ______ 
  /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */

import TurtleGraphics.*;


public class Day3 {
    
    public static void main (String args[]){
        SketchPadWindow win = new SketchPadWindow(640,480);
        Pen p = new WiggleRainbowPen(win);
        p.setWidth(5);
        p.setDirection(0);
        p.up();
        p.move(-200);
        p.down();
        for (int x = 0; x <= 10; x++){
        p.move(60);
        p.turn(36);
        }
        
        //Move over and draw another decagon
        p.up();
        p.setDirection(0);
        p.move(200);
        p.down();
        for (int x = 0; x <= 10; x++){
        p.move(60);
        p.turn(36);
        }
        p.home();
        
        //Move over and draw another decagon
        p.up();
        p.setDirection(270);
        p.move(100);
        p.down();
        p.setDirection(0);
        for (int x = 0; x <= 10; x++){
        p.move(60);
        p.turn(36);
        }
        
    }

}
