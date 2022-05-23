package com.company;

import java.util.ArrayList;

public class ThirdTask {
    private ArrayList<String> lessThanMiddleLength = new ArrayList<String>();
    private ArrayList<String> moreThanMiddleLength = new ArrayList<String>();
    private String [] arr;
    public ThirdTask(String [] arr){
        this.arr = arr;
    }
    private double middle_length(){
        int res=0;
        for(String s:arr){
           res += s.length();
        }
        return res/arr.length;
    }
    private void moreThanMiddleLength(){
        double middleLength = middle_length();
        for(String s:arr){
            if((double)s.length() > middleLength){
                moreThanMiddleLength.add(s);
            }
        }

    }
    private void lessThanMiddleLength(){
        double middleLength = middle_length();

        for(String s:arr){
            if((double)s.length() < middleLength){
                lessThanMiddleLength.add(s);
            }
        }
    }
    public void showOnScreen(){
        moreThanMiddleLength();
        lessThanMiddleLength();
        System.out.print("Числа, довжина, яких більша за середню довжину: ");
        if(moreThanMiddleLength.size() == 0){
            System.out.println("0.");
        }else {
            for (int i = 0; i < moreThanMiddleLength.size(); i++) {
                if (i == moreThanMiddleLength.size() - 1) {
                    System.out.print(moreThanMiddleLength.get(i) + ".");
                    System.out.println();
                } else {
                    System.out.print(moreThanMiddleLength.get(i) + ", ");
                }
            }
        }
        System.out.print("Числа, довжина, яких менша за середню довжину: ");
        if(lessThanMiddleLength.size() == 0){
            System.out.println("0.");
        } else{
        for(int i = 0; i < lessThanMiddleLength.size(); i++){
            if(i == lessThanMiddleLength.size() -1){
                System.out.print(lessThanMiddleLength.get(i)+".");
                System.out.println();
            }
            else{
                System.out.print(lessThanMiddleLength.get(i)+", ");
            }
        }
        }
    }
}
