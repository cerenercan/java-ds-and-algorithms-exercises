package com.company.data_structures.queues;

import java.util.Arrays;

public class Queue {

    private int maxSize;
    private long [] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new long[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long value){
//        ====================================
//        This section is to create a circular queue.
//        The new inserted values overrides the queue from the 0th index.
        if (rear == maxSize - 1){
            rear = -1;
        }
//        ====================================
        rear++;
        queueArray[rear] = value;
        nItems++;
    }

    public long remove(long value){
        long firstElement = this.queueArray[front];
        this.front++;
        if (this.front == this.maxSize){
            this.front = 0;
        }
        this.nItems--;
        return firstElement;
    }

    public long peekFront(){
        return this.queueArray[this.front];
    }

    public boolean isEmpty(){
        return nItems == 0;
    }

    public boolean isFull(){
        return nItems == maxSize;
    }

    public void view(){
        System.out.println(Arrays.toString(this.queueArray));
    }
}
