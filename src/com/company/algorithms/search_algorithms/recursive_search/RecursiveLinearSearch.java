package com.company.algorithms.search_algorithms.recursive_search;

public class RecursiveLinearSearch {

    public int recursiveLinearSearching(int [] arr, int index, int value){

        if (index > arr.length - 1)
            return -1;
        else if (arr[index] == value)
            return index;
        else{
            System.out.println("index at: " + index);
            return recursiveLinearSearching(arr, index + 1, value);
        }


    }

}
