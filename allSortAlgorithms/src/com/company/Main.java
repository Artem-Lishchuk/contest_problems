package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        int max= Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
    long ShuttleTime, SelectionTime , BubbleTime , InsertionTime, MergeSortTime, QuickSortTime;
    int [] arr = new int[10];
        Random random = new Random();
    for(int i = 0;i<arr.length;i++){
        arr[i] = random.nextInt(10 - 0)+0;
    }

    BubbleSort bubbleSort = new BubbleSort(arr);
    SelectionSort selectionSort = new SelectionSort(arr);
    ShuttleSort shuttleSort = new ShuttleSort(arr);
    InsertionSort insertionSort = new InsertionSort(arr);
    MergeSort mergeSort = new MergeSort(arr);
    QuickSort quickSort = new QuickSort(arr);


    long beg_1 = System.currentTimeMillis();
    selectionSort.onScreenView();
    SelectionTime = System.currentTimeMillis() - beg_1;

   long beg_2 = System.currentTimeMillis();
   shuttleSort.onScreenView();
   ShuttleTime = System.currentTimeMillis() - beg_2;


    long beg_3 = System.currentTimeMillis();
    bubbleSort.onScreenView();
    BubbleTime = System.currentTimeMillis() - beg_3;


    long beg_4 = System.currentTimeMillis();
    insertionSort.onScreenView();
    InsertionTime = System.currentTimeMillis() - beg_4;


    long beg_5 = System.currentTimeMillis();
    mergeSort.onScreenView();
    MergeSortTime = System.currentTimeMillis()- beg_5;


    long beg_6 = System.currentTimeMillis();
    quickSort.onScreenView();
    QuickSortTime = System.currentTimeMillis() - beg_6;


    System.out.println("Shuttle time: "+ ShuttleTime);
    System.out.println("Selection time: "+ SelectionTime);
    System.out.println("Bubble time: "+BubbleTime);
    System.out.println("Insertion time: "+InsertionTime);
    System.out.println("MergeSort time: "+MergeSortTime);
    System.out.println("QuickSort time: "+QuickSortTime);

    }

}
