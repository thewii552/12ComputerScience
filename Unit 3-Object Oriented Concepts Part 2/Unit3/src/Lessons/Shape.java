package Lessons;

import TurtleGraphics.Pen;

public interface Shape {
    
       

    public double getArea();

    public void draw(Pen p);

    public double getXPos();

    public double getYPos();

    /**
     * Move the Shape to a specific location
     *
     * @param x Specify X Position to move to
     *
     * @param y Specify Y position to move to
     */
    public void move(double x, double y);

    /**
     * Scale the shape by a specific factor
     *
     * @param factor Specify scale factor
     */
    public void stretchBy(double factor);
    
    @Override
    public String toString();
}
