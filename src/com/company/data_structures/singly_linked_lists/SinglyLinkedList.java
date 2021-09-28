package com.company.data_structures.singly_linked_lists;

public class SinglyLinkedList {

    private Node first;

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.setNext(first);
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
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

    public void insertLast(int data){
        Node current = first;
        while (current.getNext() != null){
            current = current.getNext();
        }
        Node newNode = new Node(data);
        current.setNext(newNode);
    }

}
