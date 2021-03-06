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

import g4p_controls.*;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import processing.core.*;

public class DrawFace extends PApplet {

    GButton btnMove, btnResize, btnColour;
    GSlider sldMood;
    Face face1;

    //Start the PApplet
    public static void main(String args[]) {
        PApplet.main("projects.DrawFace");
    }

    //Set up everything
    @Override
    public void setup() {
        size(422, 480);
        background(255);
        //Create the face
        face1 = new Face(this, 200, 200);

        //Buttons!
        btnMove = new GButton(this, 22, 20, 80, 30);
        btnMove.setText("Move Face");
        
        btnResize = new GButton(this, 170, 20, 80, 30);
        btnResize.setText("Resize Face");
        
        btnColour = new GButton(this, 310, 20, 80, 30);
        btnColour.setText("Set Colour");

        //Slider
        sldMood = new GSlider(this, 140, 450, 250, 20, 15);
        sldMood.setLimits(0, 100);
    }

    @Override
    public void draw() {
        background(255);
        face1.draw();
        //Text for the slider label
        fill(0);
        text("Happiness: "+Byte.toString(face1.getHappiness()),45,465);
        
    }
    
    public void handleSliderEvents(GValueControl slider, GEvent event) {        
        face1.setHappiness((byte) sldMood.getValueI());
    }
    
    public void handleButtonEvents(GButton button, GEvent event) {
        if (button == btnMove) {
            face1.move(Float.parseFloat(JOptionPane.showInputDialog("Enter x value")), Float.parseFloat(JOptionPane.showInputDialog("Enter y value")));
        }
        
        if (button == btnColour) {
            face1.setColour(JColorChooser.showDialog(this, "Choose a new colour", Color.yellow));
        }
        
        if (button == btnResize) {
            face1.setDiameter(Float.parseFloat(JOptionPane.showInputDialog("Enter new diameter")));
        }
        
    }
    
}
