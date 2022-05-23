package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
    int aim = 5 ;
    int[]a;
    a = new int[5];
    rec(5,0,0,a,1);
    }
    static void rec(int aim,int idx,int sum , int[]a,int last){
        if (aim == sum){
            out(idx , a);
            return;
        }
        for (int i=last; i <= aim-sum; i++){
            a[idx]=i;
            rec(aim,idx+1,sum+i, a , i);
        }
    }
    static void out(int idx , int [] a){
        for (int i =0; i < idx;i++) {
            if (i == idx - 1) {
                System.out.print(a[i]);
            } else {
                System.out.printf("%d+", a[i]);
            }
        }
        System.out.println();
    }
}
