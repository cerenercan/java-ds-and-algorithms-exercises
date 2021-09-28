package com.company.data_structures.doubly_linked_lists;

public class DoublyLinkedList {

    private Node first;
    private Node last;

    private boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            last = newNode;
        } else {
            first.setPrevious(newNode);
        }
        newNode.setNext(first);
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            first = newNode;
        } else {
            last.setNext(newNode);
            newNode.setPrevious(last);
        }
        last = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        if (first.getNext() == null){
            last = null;
        } else {
            first.getNext().getPrevious().setPrevious(null);
        }
        first = first.getNext();
        return temp;
    }

    public Node deleteLast(){
        Node temp = last;
        if (first.getNext() == null){
            first = null;
        } else {
            last.getPrevious().getNext().setNext(null);
        }
        last = last.getPrevious();
        return temp;
    }

    public boolean insertAfter(int key, int data){
        Node current = first;
        while (current.getData() != key){
            current = current.getNext();
            if (current == null){
                return false;
            }
        }
        Node newNode = new Node(data);
        if (current == last){
            current.setNext(null);
            last = newNode;
        } else {
            newNode.setNext(current.getNext());
            current.getNext().getPrevious().setPrevious(newNode);
        }
        newNode.setPrevious(current);
        current.setNext(newNode);

        return true;
    }

    public Node deleteKey(int key){
        Node current = first;
        while (current.getData() != key) {
            current = current.getNext();
            if (current == null){
                return null;
            }
        }

        if (current == first) {
            first = current.getNext();
        } else {
            current.getPrevious().getNext().setNext(current.getNext());
        }

        if (current == last){
            last = current.getPrevious();
        } else {
            current.getNext().getPrevious().setPrevious(current.getPrevious());
        }
        return current;
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

}


















