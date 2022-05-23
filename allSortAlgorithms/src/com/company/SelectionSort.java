package com.company;

import java.util.Arrays;

public class SelectionSort {
    // Програма сортування вибром, тобто
    private int [] arr;
    public SelectionSort(int []arr){this.arr = arr;}
    private void selectionSort(){
        for (int left = 0; left < arr.length;left++){
            int minInd = left;
            int min = arr[minInd];
            for (int i = left+1; i< arr.length;i++){
                if(arr[i] < min){
                    minInd = i;
                    min = arr[i];
                }
            }
            swap(arr,left,minInd);
        }
    }
    public void onScreenView(){
        selectionSort();
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[] array, int left, int minInd) {
        int tmp = array[left];
        array[left] = array[minInd];
        array[minInd] = tmp;
    }
}
