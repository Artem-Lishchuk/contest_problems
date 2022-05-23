package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort{
    private int [] arr;
    public MergeSort(int [] arr){ this.arr = arr;}
    private void mergeSort(int [] arr, int left, int right){
        int delimiter = left + ((right - left) / 2) + 1;
        if(delimiter > 0 && right > left + 1){
            mergeSort(arr,left,delimiter-1);
            mergeSort(arr, delimiter, right);
        }
        int[] buffer = new int[right - left + 1];

// Начиная от указанной левой границы идём по каждому элементу

        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {

// Мы используем delimeter чтобы указывать на элемент из правой части


// Если delimeter > right, значит в правой части не осталось недобавленных элементов

            if (delimiter > right || arr[cursor] > arr[delimiter]) {
                buffer[i] = arr[cursor];
                cursor++;
            } else {
                buffer[i] = arr[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, arr, left, buffer.length);
    }
    public void onScreenView(){
        System.out.println(Arrays.toString(arr));
    }
}
