/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package ShpMaker.shapes;

import TurtleGraphics.Pen;

public class Triangle extends Shape {

    private double xPos2, xPos3, yPos2, yPos3;
    
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        xPos = x1;
        yPos = y1;
        xPos2 = x2;
        yPos2 = y2;
        xPos3 = x3;
        yPos3 = y3;
    }
    
    public Triangle(double x, double y){
        this (x,y,x-50,y-50,x+50,y-50);
    }
    
    public Triangle(){
        this (0,0,100,0,50,100);
    }

    @Override
    public double getArea() {
        return Math.abs(((xPos*yPos2-xPos2*yPos)+(xPos2*yPos3-xPos3*yPos2)+xPos3*yPos-xPos*yPos3));
    }

    @Override
    public void draw(Pen p) {
        //Lift the pen
        p.up();
        //Go to first position
        p.move(xPos, yPos);
        //Lower the pen
        p.down();
        //Move to all the points
        p.move(xPos2, yPos2);
        p.move(xPos3, yPos3);
        p.move(xPos, yPos);
    }

    @Override
    public void stretchBy(double factor) {
        //Determine coordinate distance and multiply by factor
        //Then adjust coordinates respectively
        
        //Use xpos and ypos as "home"
        
        //Start with point 2
        double distX = (xPos2-xPos)*factor;
        double distY = (yPos2 - yPos)*factor;
        //Go to that place
        xPos2 = xPos+distX;
        yPos2 = yPos+distY;
        
        //Point 3
        distX = (xPos3-xPos)*factor;
        distY = (yPos3 - yPos)*factor;
        //Go to that place
        xPos3 = xPos+distX;
        yPos3 = yPos+distY;
        
    }
    
    @Override
    public void move (double x, double y){
        double difx = xPos - x;
        double dify = yPos - y;
        
        xPos = x;
        yPos = y;
        xPos2 = xPos2-difx;
        yPos2 = yPos2-dify;
        xPos3 = xPos3-difx;
        yPos3 = yPos3-dify;
    }
    
    public void move(double x1, double y1, double x2, double y2, double x3, double y3){
        xPos = x1;
        yPos = y1;
        xPos2 = x2;
        yPos2 = y2;
        xPos3 = x3;
        yPos3 = y3;
    }
    
    @Override
    public double getPerimiter(){
        double perim=0;
        perim += Math.sqrt((xPos2-xPos)*(xPos2-xPos)+(yPos2 - yPos)*(yPos2 - yPos));
        perim += Math.sqrt((xPos3-xPos2)*(xPos3-xPos2)+(yPos3 - yPos2)*(yPos3 - yPos2));
        perim += Math.sqrt((xPos-xPos3)*(xPos-xPos3)+(yPos - yPos3)*(yPos - yPos3));
        return perim;
    }

    @Override
    public String toString() {
        String str = "Triangle\n";
        
        str += "Points: (" + xPos + ", " + yPos + "), " + 
                "(" + xPos2 + ", " + yPos2 + "), " + 
                "(" + xPos3 + ", " + yPos3 + ")" + 
                "\n";
        
        str += "Area: " + Math.round(getArea()) + " pixels\n";
        str += "Perimiter: "+ Math.round(getPerimiter())+" pixels";
        return str;
    }

}
