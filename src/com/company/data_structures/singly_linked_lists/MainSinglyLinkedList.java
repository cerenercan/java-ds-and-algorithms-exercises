package com.company.data_structures.singly_linked_lists;

public class MainSinglyLinkedList {

    public static void mainSinglyLinkedLists(){

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(100);
        singlyLinkedList.insertFirst(50);
        singlyLinkedList.insertFirst(99);
        singlyLinkedList.insertLast(1);
        singlyLinkedList.insertFirst(88);

        singlyLinkedList.displayList();
    }
}
