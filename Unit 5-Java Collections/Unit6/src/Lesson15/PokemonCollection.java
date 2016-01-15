/*
 ____  ____   ___    ____     ___ __    __      _      ____  ______ 
 /    ||    \ |   \  |    \   /  _]  |__|  |    | |    |    ||      |
 |  o  ||  _  ||    \ |  D  ) /  [_|  |  |  |    | |     |  | |      |
 |     ||  |  ||  D  ||    / |    _]  |  |  |    | |___  |  | |_|  |_|
 |  _  ||  |  ||     ||    \ |   [_|  `  '  |    |     | |  |   |  |  
 |  |  ||  |  ||     ||  .  \|     |\      /     |     | |  |   |  |  
 |__|__||__|__||_____||__|\_||_____| \_/\_/      |_____||____|  |__|  
                                                                    
 */
package Lesson15;

import java.util.HashSet;

public class PokemonCollection {

    public static void main(String[] args) {
        HashSet<Pokemon> ball = new HashSet();
        ball.add(new Pokemon(25, "Pikachu"));
        ball.add(new Pokemon(26, "Raichu"));
        ball.add(new Pokemon(25, "Pikachu"));

        System.out.println(ball.toString());
    }
}
