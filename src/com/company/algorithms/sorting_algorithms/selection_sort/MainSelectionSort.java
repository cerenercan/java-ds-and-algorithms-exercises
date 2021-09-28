package com.company.algorithms.sorting_algorithms.selection_sort;

public class MainSelectionSort {


    public static void mainSelectionSorting(){

        int [] myArr = SelectionSort.selectionSort(new int[] {9, 8, 3, 13, 87, 12, 99});
        for (int j : myArr) {
            System.out.println(j);
        }
    }
}
