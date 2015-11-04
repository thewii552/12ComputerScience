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

import TurtleGraphics.Pen;

public class Wheel extends Circle {

    int numSpokes;

    public Wheel(double x, double y, double r, int s) {
        super(x, y, r);
        numSpokes = s;
    }

    public Wheel() {
        numSpokes = 6;
    }

    @Override
    public void draw(Pen p) {
        super.draw(p);
        drawSpokes(p);
    }
    
    private void drawSpokes(Pen p){
        //Lift
        p.up();
        //Go to center
        double homeX = super.getXPos();
        double homeY = super.getYPos();
        p.move (homeX, homeY);
        //Draw spokes
        p.setDirection(0);
        for (int x = 0; x < numSpokes; x++){
            
            p.down();
            p.move(super.getRadius());
            p.up();
            p.move(homeX, homeY);
            p.turn(360/numSpokes);
            
            
        }
    }

}
