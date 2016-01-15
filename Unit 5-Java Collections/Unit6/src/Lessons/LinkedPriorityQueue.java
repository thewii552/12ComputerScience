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

import java.util.ArrayList;

public class LinkedPriorityQueue extends LinkedQueue {

    ArrayList list[];

    public LinkedPriorityQueue(int numPriorities) {
        list = new ArrayList[numPriorities];
        for (int x = 0; x < numPriorities; x++) {
            list[x] = new ArrayList();
        }

    }

    public boolean isEmpty() {
        for (ArrayList l : list) {
            if (!l.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Object peekFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        for (ArrayList list1 : list) {
            if (!list1.isEmpty()) {
                return list1.get(0);
            }
        }
        return null;
    }

    public void enqueue(Object o, int p) {
        list[p].add(o);
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        for (ArrayList list1 : list) {
            if (!list1.isEmpty()) {
                return list1.remove(0);
            }
        }
        return null;
    }

}
