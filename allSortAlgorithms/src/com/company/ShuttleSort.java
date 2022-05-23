package com.company;

import java.util.Arrays;

public class ShuttleSort {
    private int[]arr;
    public ShuttleSort(int [] arr) {
        this.arr = arr;
    }
    private void sort(){
        for(int i=1; i < arr.length;i++){
            if(arr[i-1] > arr[i]){
                swap(arr,i,i-1);
                for(int z = i-1; z-1 >= 0; z--){
                    if(arr[z]< arr[z-1]){
                        swap(arr,z,z-1);
                    }//if
                    else{
                        break;
                    } // else
                }// for
            }// if first
        }// for first
    } // method
    private static void swap(int[] array, int left, int minInd) {
        int tmp = array[left];
        array[left] = array[minInd];
        array[minInd] = tmp;
    }
    public void onScreenView(){
        sort();
        System.out.println(Arrays.toString(arr));
    }
}
