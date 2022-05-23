package com.company;

import java.util.Arrays;

public class QuickSort {
    int [] arr;
    public QuickSort(int [] arr){this.arr = arr;}
    public static void quickSort(int[] arr, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = arr[(leftMarker + rightMarker) / 2];
        do {

// Двигаем левый маркер слева направо пока элемент меньше, чем pivot

            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }

// Двигаем правый маркер, пока элемент больше, чем pivot

            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }

// Проверим, не нужно обменять местами элементы, на которые указывают маркеры

            if (leftMarker <= rightMarker) {

// Левый маркер будет меньше правого только если мы должны выполнить swap

                if (leftMarker < rightMarker) {
                    int tmp = arr[leftMarker];
                    arr[leftMarker] = arr[rightMarker];
                    arr[rightMarker] = tmp;
                }

// Сдвигаем маркеры, чтобы получить новые границы

                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);


// Выполняем рекурсивно для частей

        if (leftMarker < rightBorder) {
            quickSort(arr, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(arr, leftBorder, rightMarker);
        }
    }
    public void onScreenView(){
        System.out.println(Arrays.toString(arr));
    }
}
