package com.company.heap;

public class Heap {

    private Node [] heapArray;
    private int maxSize; //size of the array
    private int currentSize; //numbers of the nodes in the array

    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.currentSize = 0;
        this.heapArray = new Node[maxSize];
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public boolean isEmpty(){
        return currentSize == 0;
    }

    public boolean insert(int key){
        if (currentSize == maxSize){
            System.out.println("Array is full.");
            return false;
        }
        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;

        trickleUp(currentSize);
        currentSize++;

        return true;
    }

    public void trickleUp(int currentSize){
        int parentIndex = (currentSize - 1) / 2;
        Node nodeToInsert = heapArray[currentSize];

        while (currentSize > 0 && heapArray[parentIndex].getKey() < nodeToInsert.getKey()) {
            heapArray[currentSize] = heapArray[parentIndex];
            currentSize = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        heapArray[currentSize] = nodeToInsert;
    }

    public Node remove(){
        Node root = heapArray[0];
        currentSize--;
        heapArray[0] = heapArray[currentSize];

        trickleDown(0);
        return root;
    }

    private void trickleDown(int index){
        int largerChildIndex;
        Node top = heapArray[index];

        while (index < currentSize / 2){
            int leftChildIndex = (2 * index) + 1;
            int rightChildIndex = (2 * index) + 2;

            if (rightChildIndex < currentSize &&
                heapArray[leftChildIndex].getKey() < heapArray[rightChildIndex].getKey()) {
                largerChildIndex = rightChildIndex;
            } else {
                largerChildIndex = leftChildIndex;
            }
            if (top.getKey() >= heapArray[largerChildIndex].getKey()) {
                break;
            }
            heapArray[index] = heapArray[largerChildIndex];
            index = largerChildIndex;
        }
        heapArray[index] = top;
    }

    public void displayHeap() {
        System.out.println("Heap Array: ");
        for(int m = 0; m < currentSize; m++) {
            if(heapArray[m] != null) {
                System.out.print( heapArray[m].getKey() + " ");
            }
            System.out.println();

            int nBlanks = 32;
            int itemsPerRow = 1;
            int column = 0;
            int j = 0; // current item

            String dots = "...............................";
            System.out.println(dots+dots);
            while(currentSize > 0) {
                if(column == 0) {
                    for(int k = 0; k < nBlanks; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.print(heapArray[j].getKey());
                j++;
                if(j == currentSize) {
                    break;
                }
                column++;
                // end of row
                if(column == itemsPerRow) {
                    nBlanks = nBlanks/2; // half the blanks
                    itemsPerRow = itemsPerRow * 2;     // twice the items
                    column = 0;
                    System.out.println();
                } else {
                    for(int k=0; k<nBlanks*2; k++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("\n"+dots+dots);
        }
    }
}