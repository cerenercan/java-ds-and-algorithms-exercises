package com.company.algorithms.search_algorithms.linear_search;

public class LinearSearch {

    public static int linearSearchAlgorithm(int [] arr, int value){

        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
}