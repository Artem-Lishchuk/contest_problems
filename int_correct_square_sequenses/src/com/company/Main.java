package com.company;

public class Main {

    public static void main(String[] args) {
        char[] given = {'(', ')'};
        int amount = 6, idx = 0, bal = 0;
        char[] s;
        s = new char[amount];
        rec(amount, idx, s, bal, given);

    }

    static void rec(int amount, int idx, char[] s, int bal, char[] given) {
        if (idx == amount){
            if(bal == 0){
                out(s);
            }
            return;
        }
        s[idx] = '(';
        rec(amount,idx+1,s,bal+1,given);
        if(bal == 0){
            return;
        }
        s[idx] = ')';
        rec(amount,idx+1,s,bal-1,given);
    }
    static void out(char[]s){
        for (char i: s){
            System.out.print(i);
        }
        System.out.println();
    }
}