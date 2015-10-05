/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package projects;

import java.awt.Color;
import processing.core.PApplet;

public class Face {

    //Fields
    private float xloc, yloc, diameter;
    private byte happiness;
    private Color colour;
    private final PApplet p;

    /**
     *
     * @param applet The PApplet which this face exists on
     * @param startx The initial x location
     * @param starty The initial Y location
     */
    public Face(PApplet applet, float startx, float starty) {
        p = applet;
        xloc = startx;
        yloc = starty;
        happiness = 50;
        diameter = 150;
        colour = Color.YELLOW;
    }

    /**
     *
     * @param newDia Set new diameter as float value in pixels
     */
    public void setDiameter(float newDia) {
        diameter = newDia;
    }
    /**
     * 
     * @return the happiness
     */
    public byte getHappiness(){
        return happiness;
    }

    /**
     *
     * @param newHappy Set "happiness" as a byte from 0-100. Corresponds to
     * facial expression, with 0 a frown and 100 a smile
     */
    public void setHappiness(byte newHappy) {
        happiness = newHappy;
    }

    /**
     *
     * @param newColour uses java.awt.Color to set the face colour
     */
    public void setColour(Color newColour) {
        colour = newColour;
    }

    /**
     *
     * @param x Set the new X location
     * @param y Set the new Y location
     */
    public void move(float x, float y) {
        xloc = x;
        yloc = y;
    }

    /**
     * Draws the face as per previously set params
     */
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        p.fill(colour.getRGB());
        p.ellipse(xloc, yloc, diameter, diameter);
        drawFace();

    }

    private void drawFace() {
        float radius = diameter/2;
        p.fill(0);
        //Draw the eyes
        p.ellipse(xloc-diameter*0.2f, yloc-diameter*0.15f, radius*0.2f, radius*0.2f);
        p.ellipse(xloc+diameter*0.2f, yloc-diameter*0.15f, radius*0.2f, radius*0.2f);
        //Draw the mouth
        p.fill(0,0);
        p.strokeWeight(diameter/20);
        //convert the happiness to a value that can be used to draw the face, from 0.1 to 0.3
        float hap = (0.3f-(float)happiness/500f);
        float hap2 = (float)happiness / 500f;
        p.bezier(xloc-diameter*0.3f, yloc+diameter*hap,xloc-diameter*0.1f, yloc+diameter*(0.1f+hap2),xloc+diameter*0.1f, yloc+diameter*(0.1f+hap2),xloc+diameter*0.3f, yloc+diameter*hap);
        p.strokeWeight(2);
    

    }
}
