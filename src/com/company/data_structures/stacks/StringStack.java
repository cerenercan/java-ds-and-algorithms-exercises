package com.company.data_structures.stacks;

public class StringStack {

    private int maxSize;
    private char [] stackArray;
    private int top;

    public StringStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char ch){
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            top++;
            stackArray[top] = ch;
        }
    }

    public char pop(){
        if (isEmpty()){
            System.out.println("The stack is empty.");
            return '-';
        } else {
            int oldTop = this.top;
            top--;
            return stackArray[oldTop];
        }
    }

    public boolean isEmpty(){
        return this.top == -1;
    }

    public boolean isFull(){
        return this.maxSize - 1 == this.top;
    }
}
