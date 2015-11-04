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

public class Circle implements Shape {

    private double xPos, yPos, radius;

    public Circle() {
        this(0, 0, 1);
    }

    public Circle(double x, double y, double r) {
        xPos = x;
        yPos = y;
        radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw(Pen p) {
        //Move the pen to it's location
        p.up();
        p.move(xPos, yPos);
        p.setDirection(270);
        p.move(radius);
        p.setDirection(0);
        p.down();
        //Calculate the step size
        double stepSize = (Math.PI*radius*2)/360;
        //Draw the circle
        for (int x = 0; x < 360; x ++){
            p.move (stepSize);
            p.turn(1);
        }
    }

    @Override
    public double getXPos() {
        return xPos;
    }

    @Override
    public double getYPos() {
        return yPos;
    }
    
    public double getRadius(){
        return radius;
    }

    @Override
    public void move(double x, double y) {
        xPos = x;
        yPos = y;
    }

    @Override
    public void stretchBy(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        String str = "CIRCLE\n";
        str+= "Radius: "+radius+"\n";
        str+="Location: ("+xPos+", "+yPos+")\n";
        str+= "Area: "+Math.round(getArea())+"pixels\n";
        return str;
    }

}
