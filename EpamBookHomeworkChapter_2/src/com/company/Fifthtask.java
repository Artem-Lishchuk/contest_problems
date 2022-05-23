package com.company;

import java.util.ArrayList;

public class Fifthtask {
    private String[] arr;
    private ArrayList<String> evenEqualOdd = new ArrayList<String>();
    private int amountFullEvenNumbers = 0;
    public  Fifthtask(String [] arr){
        this.arr = arr;
    }
    private void countFullEven(){
        for(String s: arr){
            boolean isOdd = false;
            for(char i:s.toCharArray()){
                if(Integer.valueOf(i) %2 == 1){
                    isOdd = true;
                }
            }
            if(!isOdd){
                amountFullEvenNumbers ++;
            }
        }
    }
    private void countEvenEqualOdd(){
        for(String s:arr){
            int even = 0, odd = 0;
            for(char i: s.toCharArray()){
                if(Integer.valueOf(i) %2 == 0){ even ++;
                } else{ odd ++ ;}
            }
            if( even == odd){
                evenEqualOdd.add(s);
            }
        }
    }
    public void onScreenView(){
        countEvenEqualOdd();
        countFullEven();
        int tmp = amountFullEvenNumbers;
        while(tmp > 100){
            tmp -= 100;
        }
        if(tmp < 15){
            if(tmp == 1){
                if(amountFullEvenNumbers == 1){
                    System.out.printf("Було введено %d число, що має усі цифри в своєму записі парні.%n",amountFullEvenNumbers);
                } else {
                    System.out.printf("Було введено %d число, що мають усі  цифри в своєму записі парні.%n", amountFullEvenNumbers);
                }
                }
            else if(tmp == 2 || tmp == 3 || tmp==4){
                System.out.printf("Було введено %d числа, що мають усі  цифри в своєму записі парні.%n",amountFullEvenNumbers);
            }
            else{
                System.out.printf("Було введено %d чисел, що мають усі цифри в своєму записі парні.%n",amountFullEvenNumbers);
            }
        }
        else{
            if(tmp % 10 == 1){
                System.out.printf("Було введено %d число, що мають усі  цифри в своєму записі парні.%n",amountFullEvenNumbers);
            }
            else if(tmp % 10 == 2 || tmp % 10 == 3 || tmp % 10 == 4){
                System.out.printf("Було введено %d числа, що мають усі  цифри в своєму записі парні.%n",amountFullEvenNumbers);
            }
            else{
                System.out.printf("Було введено %d чисел, що мають усі  цифри в своєму записі парні.%n",amountFullEvenNumbers);
            }
        }
        System.out.print("Усі числа, що  мають однакову кількість парних та непарних цифр у своєму записі: ");
        if(evenEqualOdd.size() == 0){
            System.out.println("0.");
        }else {
            for (int i = 0; i < evenEqualOdd.size(); i++) {
                if (i == evenEqualOdd.size() - 1) {
                    System.out.print(evenEqualOdd.get(i) + ".");
                    System.out.println();
                } else {
                    System.out.print(evenEqualOdd.get(i) + ", ");
                }
            }
        }
        }
}
