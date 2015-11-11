/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Projects;

import Projects.shapes.*;

import TurtleGraphics.*;

public class Drawing {

    public static SketchPadWindow win = new SketchPadWindow(800, 800);
    public static Pen p = new StandardPen(win);
    public static Shape s = new Circle();
    public static void main(String args[]) {
        s.stretchBy(3);
      // p.setWidth(100);
        s.draw(p);
        
        //Make a rectangle from the circle
        s = makeShape("rectangle",s);
        s.draw(p);
        
     
        
        Shape w = makeShape("triangle",s);
        w.draw(p);
        
        
        
    }
    
    public static Shape makeShape (String type, Shape s){
        Shape returnShape;
        double x = s.getXPos();
        double y = s.getYPos();
        
        //Detrmine return type
        switch (type) {
            case "circle":
                returnShape = new Circle(x,y,50);
                break;
            case "wheel":
                returnShape = new Wheel(x,y,50,8);
                break;
            case "triangle":
                returnShape = new Triangle(x,y);
                break;            
            default:
                returnShape = new Rectangle(x, y, 100, 150);
                break;
        }
            
        return returnShape;
    }

}
