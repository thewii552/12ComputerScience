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

public class NightClub {

    public static void main(String[] args) {
        LinkedPriorityQueue lineup = new LinkedPriorityQueue(2);
        lineup.enqueue("Paris", 0);
        lineup.enqueue("Joe", 1);
        lineup.enqueue("Jamal", 1);
        lineup.enqueue("Famous 2", 0);
        while (!lineup.isEmpty()) {
            System.out.println(lineup.dequeue());
        }
        lineup.enqueue("Regular 1", 1);
        lineup.enqueue("Regular 2", 1);
        lineup.enqueue("Regular 3", 1);
        lineup.enqueue("Famous 3", 0);
        while (!lineup.isEmpty()) {
            System.out.println(lineup.dequeue());
        }
    }
}
