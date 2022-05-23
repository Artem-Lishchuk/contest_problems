package com.company;

import java.util.ArrayList;

public class SeventhTask{
    private String [] arr;
    String first = "";
    public SeventhTask(String [] arr){
        this.arr = arr;
    }
    private void returnTheCorrectAnswer(){
        for(String s:arr){
            if(differntNumsChecker(s.toCharArray())){
                first = s;
                break;
            }
        }
    }
    private boolean differntNumsChecker(char [] chars){
        boolean gg = true;
        ArrayList<Character> used = new ArrayList<>();
        used.add(0,chars[0]);
        for (int i = 1; i < chars.length; i++){
            if(used.contains(chars[i])){
                return false;
            }
            used.add(chars[i]);
        }
        return true;
    }
    public void onScreenView(){
        returnTheCorrectAnswer();
        if(first.equals("")){
            System.out.println("Немає чисел, що складаються тільки з різних цифр.");
        }
        else{
            System.out.println("Число, що складаэться з різних цифр, або перше з них: "+ first+".");
        }
    }
}
