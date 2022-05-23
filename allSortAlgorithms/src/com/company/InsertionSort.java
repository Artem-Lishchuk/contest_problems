package com.company;

import java.util.Arrays;

public class InsertionSort {
    private int [] arr;
    public InsertionSort(int[]arr){ this.arr = arr;}
    private void insertionSort(){
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else { break;}
            }
            arr[i + 1] = value;
        }
    }
    public void onScreenView(){
        insertionSort();
        System.out.println(Arrays.toString(arr));
    }
}
