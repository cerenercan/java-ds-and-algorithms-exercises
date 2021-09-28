package com.company.algorithms.sorting_algorithms.merge_sort;

import java.util.Arrays;

public class MainMergeSort {

    public static void mainMergeSorting(){

        int [] arr = {9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0};
        System.out.println("Not Sorted Array" + Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr);
        System.out.println("Merge Sorted Array" + Arrays.toString(arr));

    }
}
