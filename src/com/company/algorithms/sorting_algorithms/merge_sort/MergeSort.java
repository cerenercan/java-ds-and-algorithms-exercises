package com.company.algorithms.sorting_algorithms.merge_sort;

import java.util.Arrays;

//Run Time = O(nlogn)
public class MergeSort {

    public void sort(int [] arr){
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int [] arr, int beginning, int end){
        if (end <= beginning)
            return;

        int mid = (beginning + end) / 2;
        sort(arr, beginning, mid);
        sort(arr, mid + 1, end);
        merge(arr, beginning, mid, end);
    }

    public void merge(int [] arr, int beginning, int mid, int end){
        int [] tempArr = new int[end - beginning + 1];
        int leftSlot = beginning;
        int rightSlot = mid + 1;
        int indexCounter = 0;

        while (leftSlot <= mid && rightSlot <= end){
            if (arr[leftSlot] < arr[rightSlot]){
                tempArr[indexCounter] = arr[leftSlot];
                leftSlot++;
            } else {
                tempArr[indexCounter] = arr[rightSlot];
                rightSlot++;
            }
            indexCounter++;
        }
        if (leftSlot <= mid){
            while (leftSlot <= mid){
                tempArr[indexCounter] = arr[leftSlot];
                leftSlot++;
                indexCounter++;
            }
        } else if (rightSlot <= end) {
            while (rightSlot <= end){
                tempArr[indexCounter] = arr[rightSlot];
                rightSlot++;
                indexCounter++;
            }
        }
        System.arraycopy(tempArr, 0, arr, beginning, tempArr.length);
    }
}
