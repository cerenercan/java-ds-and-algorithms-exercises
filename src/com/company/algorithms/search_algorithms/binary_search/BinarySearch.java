package com.company.algorithms.search_algorithms.binary_search;

public class BinarySearch {

    public static int binarySearchAlgorithm(int [] myArr, int value){
        int beginning = 0;
        int last = myArr.length-1;

        while (beginning <= last){
            int midpoint = (last + beginning) / 2;
            if (myArr[midpoint] == value){
                return midpoint;
            } else if (myArr[midpoint] > value) {
                last = midpoint - 1;
            } else {
                beginning = midpoint + 1;
            }
        }
        return -1;
    }
}
