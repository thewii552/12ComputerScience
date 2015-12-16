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

import hsa.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample {

    static Console c = new Console();
    static ArrayList<String> al;
    static ListIterator li;
    static int pos;
    
    public static void main(String args[]) {
        al = new ArrayList();
        al.add("a");
        al.add("b");
        al.add("c");
        li = al.listIterator();
        showList();
        //move one
        c.println((String)li.next());
        pos++;
        showList();
        //move one
        c.println((String)li.next());
        pos++;
        showList();
        //move one
        c.println((String)li.next());
        pos++;
        showList();
        
    }
    
    public static void showList(){
        for (int x = 0; x < al.size(); x++){
            if (x == pos){
                c.print("*");
            }
            c.print(al.get(x));
        }
        if (pos == al.size())c.print("*");
        c.println("");
    }
}
