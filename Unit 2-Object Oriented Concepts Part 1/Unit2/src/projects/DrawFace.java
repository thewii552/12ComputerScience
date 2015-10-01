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
import processing.core.*;
import g4p_controls.*;


public class DrawFace extends PApplet {
    GButton btnMove, btnResize, btnColour, btnMood;
    Face face1;
    //Start the PApplet
    public static void main (String args[]){
        PApplet.main("projects.DrawFace");
    }
    //Set up everything
    @Override
    public void setup(){
        size(422,480);
        background(255);
        //Create the face
        face1 = new Face(this, 200,200);
        
        
        //Buttons!
        btnMove = new GButton(this, 22,20,80,30);
        btnMove.setText("Move Face");
        
        btnResize = new GButton(this, 122,20,80,30);
        btnResize.setText("Resize Face");
        
        btnColour = new GButton(this, 222,20,80,30);
        btnColour.setText("Set Colour");
        
        btnMood = new GButton(this, 322,20,80,30);
        btnMood.setText("Set Mood");
        //fill(0);
        //rect(30,30,100,100);
    }
    @Override
    public void draw(){
        background(255);
        face1.draw();
    }

}
