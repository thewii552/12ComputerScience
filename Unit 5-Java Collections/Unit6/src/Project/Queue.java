/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import Lessons.*;

/**
 *
 * @author andr6491
 */
public interface Queue {

    public Object peekFront();

    public Object dequeue();

    public void enqueue(Object o);

    public int size();

}
