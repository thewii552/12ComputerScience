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

import javax.swing.ImageIcon;

public class Craps {
    private Dice die1, die2;
    private int numRolls, point;
    
    Craps(){
        die1=new Dice();
        die2=new Dice();
        numRolls=0;
        point=0;
    }
    
    public ImageIcon getDicePic(int x){
        if (x==1){
            return die1.getPic();
        }
        else{
            return die2.getPic();
        }
    }
    
    public int getTotal(){
        return die1.getNumber() + die2.getNumber();
    }
    
    public int getPoint(){
        return point;
    }
    
    public int getNumRolls(){
        return numRolls;
    }
    
    public void roll(){
        numRolls++;
        die1.roll();
        die2.roll();
        if (numRolls==1) point=getTotal();
    }
    
    public boolean hasWon(){
        if (numRolls==1) return (getTotal()==7 || getTotal()==11);
        else    return (point == getTotal());
    }
    
    public boolean hasLost(){
        if (numRolls==1) return (getTotal()==2 || getTotal()==3 || getTotal()==10);
        else    return (getTotal()==7);
    }
    
    
    
    
    
    
    
}
