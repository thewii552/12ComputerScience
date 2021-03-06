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

import java.net.URL;
import javax.swing.ImageIcon;

public class Dice {

    private int number;
    private ImageIcon pic;

    public void Dice() {
        roll();
    }
  

    public void roll() {
        number = (int) (Math.random() * 6 + 1);
        pic = new ImageIcon("src/projects/img/d"+number+".JPG");
    }

    public int getNumber() {
        return number;
    }
    
    public ImageIcon getPic(){
        return pic;
    }

}
