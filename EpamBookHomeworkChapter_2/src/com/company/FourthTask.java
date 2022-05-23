package com.company;

import java.util.ArrayList;

public class FourthTask {
    private String[] arr;
    private int amountNums;
    private String first;
    public FourthTask(String [] arr){
        this.arr = arr;
    }
    private void differentNums(){
        amountNums = cntDifferentNum(arr[0].toCharArray());
        first = arr[0];
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for(int i = 1; i <arr.length; i++){
            if(cntDifferentNum(arr[i].toCharArray()) < amountNums){
                amountNums = cntDifferentNum(arr[i].toCharArray());
                first = arr[i];
            }
        }
    }
    private int cntDifferentNum(char [] nums){
        ArrayList<Character> used= new ArrayList<Character>();
        used.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(!used.contains(nums[i])){
                used.add(nums[i]);
            }
        }
        return used.size();
    }
    public void onScreenView(){
        differentNums();
        System.out.printf("%s - число, що має найменшу кількість різних цифр, або перше з таких.%n",first);
    }


}
