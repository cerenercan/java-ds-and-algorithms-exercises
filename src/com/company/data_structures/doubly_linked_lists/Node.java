package com.company.data_structures.doubly_linked_lists;

public class Node {

    private int data;
    private Node next;
    private Node previous;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void displayNode(){
        System.out.println("{" + data + "}");
    }
}
