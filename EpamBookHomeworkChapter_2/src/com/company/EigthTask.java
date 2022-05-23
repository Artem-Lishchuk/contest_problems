package com.company;

public class EigthTask {
    private String[] arr;
    private int cnt = 0;
    private String second = "",first="";
    public EigthTask(String[] arr){
        this.arr = arr;
    }
    private void eachStringChecker(){
        for(String s:arr){
            if(palindromChecker(s.toCharArray())){
                cnt ++;
                first = s;
            }
            if(cnt == 2){
                second = s;
                break;
            }
        }
    }
    private boolean palindromChecker(char [] chars){
        int end = chars.length -1 ,begin = 0;
        if(chars.length % 2 == 0){
            while(end - begin != 1){
                if(chars[end] != chars[begin]){
                    return false;
                }
                end --;
                begin ++;
            }
        }
        else{
            while(end - begin != 0){
                if(chars[end] != chars[begin]){
                    return false;
                }
                end --;
                begin ++;
            }
        }
        return true;
    }
    public void onScreenview(){
        eachStringChecker();
        if(cnt == 0){
            System.out.println("Чисел паліндромів немає");
        }
        else if (cnt == 1){ System.out.println("Єдинне число паліндром - "+first);}
        else{System.out.println("Друге число паліндром - "+ second);}
    }

}
