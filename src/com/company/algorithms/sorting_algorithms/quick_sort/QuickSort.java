package com.company.algorithms.sorting_algorithms.quick_sort;

public class QuickSort {

    public static int [] quickSort(int [] arr, int beginning, int end){
        if (beginning < end){
            int pivot = partition(arr, beginning, end);
            quickSort(arr, beginning, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
        return arr;
    }

    public static int partition(int [] arr, int beginning, int end){
        int pivot = arr[end];
        int j = beginning - 1;
        for (int i = beginning ; i < end ; i++){
            if (arr[i] <= pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int indexOfPivot = j + 1;
        int temp = arr[indexOfPivot];
        arr[indexOfPivot] = arr[end];
        arr[end] = temp;
        return indexOfPivot;
    }
}
