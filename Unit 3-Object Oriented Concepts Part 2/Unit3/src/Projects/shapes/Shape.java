package Projects.shapes;

import TurtleGraphics.Pen;

public abstract class Shape {
    protected double xPos, yPos;
       

    public abstract double getArea();

    public abstract void draw(Pen p);

    public final double getXPos(){
        return xPos;
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
        
}
