package com.company.data_structures.doubly_linked_lists;

public class MainDoublyLinkedList {

    public static void mainDoublyLinkedLists(){

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(22);
        doublyLinkedList.insertFirst(44);
        doublyLinkedList.insertFirst(66);
        doublyLinkedList.insertLast(11);
        doublyLinkedList.insertLast(33);
        doublyLinkedList.insertLast(55);
        doublyLinkedList.displayList();
        doublyLinkedList.deleteFirst();
        doublyLinkedList.deleteLast();
        doublyLinkedList.deleteKey(11);
        doublyLinkedList.displayList();
        doublyLinkedList.insertAfter(22, 77);
        doublyLinkedList.insertAfter(33, 88);
        doublyLinkedList.displayList();
    }
}
