package com.company.algorithms.search_algorithms.recursive_search;

public class RecursiveBinarySearch {

    public int recursiveBinarySearching(int [] arr, int start, int end, int value){
        int midPoint = (start + end) / 2;
        if (start >= end)
            return -1;
        else if (arr[midPoint] == value)
            return midPoint;
        else if (arr[midPoint] > value)
            return recursiveBinarySearching(arr, start, midPoint - 1, value);
        else
            return recursiveBinarySearching(arr, midPoint + 1, end, value);


    }
}
