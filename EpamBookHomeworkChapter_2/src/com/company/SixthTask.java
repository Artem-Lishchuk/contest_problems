package com.company;

public class SixthTask{
    private String[] arr;
    private String first = "";
    public SixthTask(String [] arr)
    {
        this.arr = arr;

    }
    private void grownSequence(){
        for(String s:arr){
            if(!checkerIfGrown(s.toCharArray())){
                first = s;
                break;
            }
        }
    }
    private boolean checkerIfGrown(char [] chars){
        boolean gg = false;
        for(int i =0; i < chars.length-1; i++){
            if(chars[i] >= chars[i+1]){
                gg = true;
            }
        }
        return gg;
    }
    public void onScreenShow(){
        grownSequence();
        if(first.equals("")){
            System.out.println("Немає чисел, в яких цифри йдуть строго в порядку збільшення");
        }
        else{
            System.out.println("Число, цифри в якому йдуть у строгому порядку збільшення: "+first);
        }

    }
}
