/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package projects2;

public class GuessMachine {

    byte num, lastGuess, numGuesses;

    void GuessMachine() {
        //Create the random number
        num = (byte) (Math.random() * 100 + 1);
        numGuesses = 0;
        lastGuess = 0;
    }

    String giveHint() {
        //Determine the hint to return
        if (lastGuess > num) {
            return ("You guessed " + lastGuess + ". TOO HIGH");

        } else if (lastGuess < num) {
            return ("You guessed " + lastGuess + ". TOO LOW");

        } else {
            return "You guessed correctly!";
        }
    }

    boolean setGuess(byte guess) {
        if (guess >= 1 && guess <= 100) {
            lastGuess = guess;
            numGuesses++;
            return true;
        } else {
            return false;
        }
    }
    
    byte getNumGuesses(){
        return numGuesses;
    }

}
