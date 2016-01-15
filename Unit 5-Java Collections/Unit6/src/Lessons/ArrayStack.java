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

public class ArrayStack implements Stack {

    private ArrayList list;

    public ArrayStack() {
        list = new ArrayList();
    }

    @Override
    public Object pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.remove(0);
    }

    @Override
    public Object peekTop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    @Override
    public void push(Object obj) {
        list.add(0, obj);
    }

    @Override
    public int size() {
        return list.size();
    }

}
