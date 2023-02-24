package com.example.lab1_1stack;

import java.util.LinkedList;

public class TqsStack<T> {

    private LinkedList<T> list = new LinkedList<>();

    public T pop(){
        return list.pop();
    }
    public int size(){
        return list.size();
    }
    public T peek(){
        return list.getFirst();
    }
    public void push(T t){
        list.push(t);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
