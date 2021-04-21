package javaBrains;

import java.util.Stack;

public class StackImplementation {
    private  int array[];
    private int top;
    private int capacity;

    StackImplementation(int capacity){
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int item){
        if(isFull()){
            throw new RuntimeException("Stack is full.");
        }
        array[++top] = item;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        return array[top--];
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty.");
        }
        return array[top];
    }

    private boolean isFull() {
        return top == -1;
    }

    private boolean isEmpty() {
        return top == capacity - 1;
    }

}
