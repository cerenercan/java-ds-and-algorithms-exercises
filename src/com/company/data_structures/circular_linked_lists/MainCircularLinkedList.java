package com.company.data_structures.circular_linked_lists;

public class MainCircularLinkedList {

    public static void mainLinkedLists(){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insertFirst(100);
        circularLinkedList.insertFirst(50);
        circularLinkedList.insertFirst(99);
        circularLinkedList.insertLast(1);
        circularLinkedList.insertFirst(88);

        circularLinkedList.displayList();
    }
}
