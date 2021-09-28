package com.company.algorithms.sorting_algorithms.insertion_sort;

//Run Time = O(n^2)
public class InsertionSort {

    public static int [] insertionSorting(int [] arr){
        for (int i = 1 ; i < arr.length ; i++){
            int element = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > element){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
        return arr;
    }
}
