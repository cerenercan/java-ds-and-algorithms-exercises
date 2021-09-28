package com.company.binary_search_trees;

import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    public void insert(int key, String value){
        Node newNode = new Node(key, value);
        if (root == null){
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true){
                parent = current;
                if (key < current.getKey()){
                    current = current.getLeftChild();
                    if (current == null){
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else {
                    current = current.getRightChild();
                    if (current == null){
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }

    public Node findMin(){
        Node current = root;
        Node last = null;
        while (current != null){
            last = current;
            current = current.getLeftChild();
        }
        return last;
    }

    public Node findMax(){
        Node current = root;
        Node last = null;
        while (current != null){
            last = current;
            current = current.getRightChild();
        }
        return last;
    }

    public boolean remove(int key){
        Node current = root;
        Node parent = root;

        boolean isLeftChild = false;

        while (current.getKey() != key){
            parent = current;
            if (key <= current.getKey()){
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
            if (current == null){
                System.out.println("Entered node couldn't found.");
                return false;
            }
        }
        Node nodeToDelete = current;
        if (nodeToDelete.getLeftChild() == null && nodeToDelete.getRightChild() == null){
            if (nodeToDelete == root){
                root = null;
            } else if (isLeftChild){
                parent.setLeftChild(null);
            } else {
                parent.setRightChild(null);
            }
        } else if (nodeToDelete.getRightChild() == null) { //if node has one child on the left
            if (nodeToDelete == root){
                root = nodeToDelete.getLeftChild();
            } else if (isLeftChild){
                parent.getLeftChild().setLeftChild(nodeToDelete.getLeftChild());
            } else {
                parent.getRightChild().setRightChild(nodeToDelete.getLeftChild());
            }
        } else if (nodeToDelete.getLeftChild() == null) { //if node has one child on the right
            if (nodeToDelete == root){
                root = nodeToDelete.getRightChild();
            } else if (isLeftChild){
                parent.getLeftChild().setLeftChild(nodeToDelete.getRightChild());
            } else {
                parent.getRightChild().setRightChild(nodeToDelete.getRightChild());
            }
        } else { //if the node has 2 children
            Node successor = getSuccessor(nodeToDelete);
            if (nodeToDelete == root){
                root = successor;
            } else if (isLeftChild){
                parent.getLeftChild().setLeftChild(successor);
            } else {
                parent.getRightChild().setRightChild(successor);
            }
            successor.getLeftChild().setLeftChild(nodeToDelete.getLeftChild());
        }
        return true;
    }

    private Node getSuccessor(Node nodeToDelete){
        Node successorParent = nodeToDelete;
        Node successor = nodeToDelete;
        Node current = nodeToDelete.getRightChild();

        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (successor != nodeToDelete.getRightChild()) {
            successorParent.getLeftChild().setLeftChild(successor.getRightChild());
            successor.setRightChild(nodeToDelete.getRightChild());
        }
        return successor;
    }

    public void displayTree() {
        Stack globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("********************************************");

        while(!isRowEmpty) {
            Stack localStack = new Stack<>();
            isRowEmpty = true;
            for(int j=0; j<nBlanks; j++) {
                System.out.print(" ");
            }
            while(!globalStack.isEmpty()) {
                Node temp = (Node)globalStack.pop();
                if(temp != null) {
                    System.out.print(temp.key);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);
                    if(temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j=0; j<nBlanks*2-2; j++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            nBlanks = nBlanks/2;

            while(!localStack.isEmpty())
                globalStack.push( localStack.pop() );
        }
        System.out.println("********************************************");

    }
}



















