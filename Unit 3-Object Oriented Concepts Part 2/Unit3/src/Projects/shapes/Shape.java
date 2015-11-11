package Projects.shapes;

import TurtleGraphics.Pen;
import java.awt.Color;

public abstract class Shape {
    protected double xPos, yPos;
       
    public Shape(){
        xPos = 0;
        yPos = 0;
    }
    public abstract double getArea();

    public abstract void draw(Pen p);

    public final double getXPos(){
        return xPos;
    }
    
    public final void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        
    }

    public final double getYPos(){
        return yPos;
    }

    /**
     * Move the Shape to a specific location
     *
     * @param x Specify X Position to move to
     *
     * @param y Specify Y position to move to
     */
    public void move(double x, double y){
        xPos = x;
        yPos = y;
    }

    /**
     * Scale the shape by a specific factor
     *
     * @param factor Specify scale factor
     */
    public abstract void stretchBy(double factor);
    
    @Override
    public String toString(){
        return "Location: ("+xPos+", "+yPos+")\n";
    }
        
}
