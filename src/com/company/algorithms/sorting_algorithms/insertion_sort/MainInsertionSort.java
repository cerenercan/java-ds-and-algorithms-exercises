package com.company.algorithms.sorting_algorithms.insertion_sort;

import java.util.Arrays;

public class MainInsertionSort {

    public static void mainInsertionSorting(){
        int [] arr = {9, 8, 99, 110, 8, 87, 637, 8, 3 , 13, 87, 12, 99};
        System.out.println(Arrays.toString(InsertionSort.insertionSorting(arr)));
    }
}
