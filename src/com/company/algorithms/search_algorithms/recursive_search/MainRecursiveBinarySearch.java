package com.company.algorithms.search_algorithms.recursive_search;

public class MainRecursiveBinarySearch {

    public static void mainRecursiveBinarySearching(){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        System.out.println(recursiveBinarySearch.recursiveBinarySearching(arr, 0, arr.length, 8));

    }
}
