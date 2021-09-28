package com.company.data_structures.linked_lists;

public class LinkedList {

    public static void mainLinkedList(){
        Node nodeA = new Node(4);
        Node nodeB = new Node(3);
        Node nodeC = new Node(7);
        Node nodeD = new Node(8);

        nodeA.setNextNode(nodeB);
        nodeB.setNextNode(nodeC);
        nodeC.setNextNode(nodeD);

        System.out.println("Value of Node A: " +listLength(nodeA));
        System.out.println("Value of Node B: " +listLength(nodeB));
        System.out.println("Value of Node C: " +listLength(nodeC));
        System.out.println("Value of Node D: " +listLength(nodeD));
    }

    public static int listLength(Node aNode){
        int length = 0;
        Node current = aNode;
        while (current != null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }
}
