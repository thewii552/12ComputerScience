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

import processing.core.*;
import g4p_controls.*;

public class ProcessSample extends PApplet {

    public GButton btnBlue, btnGreen;

   

    @Override
    public void setup() {
        size(640, 480, JAVA2D);
        background(255);
        btnBlue = new GButton(this, 10, 10, 100, 30);
        btnGreen = new GButton(this, 200, 10, 100, 30);
        btnBlue.setText("Blue Circle");
        btnGreen.setText("Green Circle");

    }
    public void handleButtonEvents(GButton button, GEvent event) {
    
    }

    @Override
    public void loop() {
        fill(0);
        rect(50,50,50,50);

    }
    
     public static void main(String args[]) {
        PApplet.main("Lessons.ProcessSample");
    }

}
