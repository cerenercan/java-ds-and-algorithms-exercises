package com.company.data_structures.circular_linked_lists;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public void insertFirst(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            last = newNode;
        }
        newNode.setNext(first);
        first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            first = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public int deleteFirst(){
        int temp = first.getData();
        if (first.getNext() == null) {
            last = null;
        }
        first = first.getNext();
        return temp;
    }

    public void displayList(){
        System.out.println("List : (first -> last)");
        Node current = first;
        while (current != null){
            current.displayNode();
            current = current.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty(){
        return first == null;
    }
}
