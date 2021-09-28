package com.company.algorithms.sorting_algorithms.quick_sort;

import java.util.Arrays;

public class MainQuickSort {

    public static void mainQuickSorting(){

        int [] arr = {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};
        System.out.println(Arrays.toString(QuickSort.quickSort(arr, 0, arr.length - 1)));

    }
}
