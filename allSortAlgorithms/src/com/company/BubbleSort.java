package com.company;

import java.util.Arrays;

public class BubbleSort {
    int[]arr;
    public BubbleSort(int[]arr){
        this.arr = arr;
    }
    private void bubbleSort(){
        boolean isSorted = false;
        int tmp;
        while(!isSorted){
            isSorted = true;
            for(int i = 0; i < arr.length- 1; i++){
                if (arr[i] > arr[i+1]){
                    swap(arr,i,i+1);
                    isSorted =false;
                }
            }
        }
    }
    private static void swap(int[] array, int left, int minInd) {
        int tmp = array[left];
        array[left] = array[minInd];
        array[minInd] = tmp;
    }
    public void onScreenView(){
        bubbleSort();
        System.out.println(Arrays.toString(arr));
    }
}
