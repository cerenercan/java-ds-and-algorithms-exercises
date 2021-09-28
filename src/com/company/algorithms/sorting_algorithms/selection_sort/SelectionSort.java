package com.company.algorithms.sorting_algorithms.selection_sort;

//Run Time = O(n^2)
public class SelectionSort {

    public static int [] selectionSort(int [] arr){
        for (int i = 0 ; i < arr.length ; i++){
            int min = i;
            for (int j = i + 1 ; j < arr.length ; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }
}
