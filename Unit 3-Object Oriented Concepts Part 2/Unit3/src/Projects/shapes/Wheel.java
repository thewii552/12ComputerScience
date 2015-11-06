/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Projects.shapes;

import TurtleGraphics.Pen;

public class Wheel extends Circle {

    int numSpokes;

    public Wheel(double x, double y, double r, int s) {
        super(x, y, r);
        numSpokes = s;
    }

    public Wheel() {
        super(0,0,100);
        numSpokes = 6;
    }

    @Override
    public void draw(Pen p) {
        super.draw(p);
        drawSpokes(p);
    }
    
    public void setSpokes (int s){
        numSpokes = s;
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
            p.move(-super.getRadius());
            p.up();
            p.move(homeX, homeY);
            p.turn(360/numSpokes);
            
            
            
        }
        
        
    }
    
    @Override
    public String toString() {
        String str = "WHEEL\n";
        str+= "Radius: "+super.getRadius()+"\n";
        str+="Location: ("+xPos+", "+yPos+")\n";
        str+= "Area: "+Math.round(getArea())+"pixels\n";
        str += "Number of spokes: "+numSpokes+"\n";
        return str;
    }

}
