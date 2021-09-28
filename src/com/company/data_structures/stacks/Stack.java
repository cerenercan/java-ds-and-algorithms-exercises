package com.company.data_structures.stacks;

public class Stack {

    private int maxSize;
    private long [] stackArray;
    private int top;

    public Stack(int maxSize){
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item){
        if (isFull()){
            System.out.println("You reached the max size of the stack.");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public long pop(){
        if (isEmpty()){
            System.out.println("The stack is empty.");
            return -1;
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public long peek(){
        return this.stackArray[top];
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull(){
        return (this.maxSize -1 == top);
    }
}
