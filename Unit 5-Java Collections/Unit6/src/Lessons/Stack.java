/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lessons;

/**
 *
 * @author andr6491
 */
public interface Stack {

    public Object pop();

    public Object peekTop();

    public void push(Object obj);

    public int size();
}
