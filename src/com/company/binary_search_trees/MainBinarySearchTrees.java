package com.company.binary_search_trees;

public class MainBinarySearchTrees {

    public static void mainBinarySearchTree(){

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10, "ten");
        bst.insert(20, "twenty");
        bst.insert(15, "fifteen");

        System.out.println("Min Value: " + bst.findMin().getKey());
        System.out.println("**********");
        System.out.println("Max Value: " + bst.findMax().getKey());

        System.out.println("If the value deleted: " + bst.remove(10));
        System.out.println("Min Value: " + bst.findMin().getKey());

        bst.displayTree();
    }
}
