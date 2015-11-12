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

public class Rectangle extends Shape {

    private double width, height;

    public Rectangle() {
        this(0, 0, 1, 1);
    }

    public Rectangle(double x, double y, double w, double h) {
        xPos = x;
        yPos = y;
        width = w;
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.setDirection(0);
        p.down();
        p.move(width);
        p.turn(-90);
        p.move(height);
        p.turn(-90);
        p.move(width);
        p.turn(-90);
        p.move(height);
        
        
    }

    @Override
    public void stretchBy(double factor) {
        width *= factor;
        height *= factor;
    }
    
    @Override
    public double getPerimiter(){
        return 2*height + 2*width;
    }
    
    @Override
    public String toString() {
        String str = "RECTANGLE\n";
        str+= "W x H: "+width+" x "+height+"\n";
        str+=super.toString();
        str+= "Area: "+Math.round(getArea())+" pixels\n";
        str += "Perimiter: "+getPerimiter();
                
        return str;
    }

}
