package com.company;

public class FirstTask {
    private String []arr;
    public FirstTask(String [] arr){
        this.arr = arr;
    }
    public void min(){
        int max = arr[0].length();
        String ret = arr[0];
        for(int i = 1;i < arr.length; i++){
            if(arr[i].length() >max){
                max = arr[i].length();
                ret = arr[i];
            }
        }
        System.out.printf("Найдовше число: %s, воно має довжину %d.%n", ret, max);
    }
    public void max(){
        String ret = arr[0];
        int min = arr[0].length();
        for(int i = 1;i < arr.length; i++){
            if(arr[i].length() < min){
                min = arr[i].length();
                ret = arr[i];
            }
        }
        System.out.printf("Найкоротше число: %s, воно має довжину %d.%n", ret, min);
    }
}
