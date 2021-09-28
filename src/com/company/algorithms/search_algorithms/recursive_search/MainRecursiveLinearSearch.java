package com.company.algorithms.search_algorithms.recursive_search;

public class MainRecursiveLinearSearch {

    public static void mainRecursiveLinearSearching(){

        RecursiveLinearSearch recursiveLinearSearch = new RecursiveLinearSearch();
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(recursiveLinearSearch.recursiveLinearSearching(arr, 0, 6));

    }
}
