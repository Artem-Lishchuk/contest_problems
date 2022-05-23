package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(checker(s));
    }
   static boolean checker(String s){
        int open = 0, close = 0;
        char [] ar = s.toCharArray();
        boolean gg = true;
        for (int i =0 ; i < ar.length ; i++ ){
            if( ar[i] == '('){
                open += 1;
            }
            else{
                close +=1;
            }
            if(open < close) {
                gg = false;
                break;
            }
        }
        if(open!= close){
            gg = false;
        }
        return gg;
}
}
