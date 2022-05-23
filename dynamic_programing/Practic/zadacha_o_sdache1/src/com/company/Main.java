package com.company;

public class Main {

    public static void main(String[] args) {
        new Solution().sdacha(4);
    }
}
class Solution{
    int sdacha(int n){
        if (n>=0 && n < 3) {
            return 1;
        }
        else if(n <= 3 && n < 5){
            int a = sdacha(n-1)+sdacha(n-3);
            System.out.println(a + "   111");
            return a;
        }
        else if(5 <= n && n <10){
            int a = sdacha(n-1)+sdacha(n-3)+sdacha(n-5);
            System.out.println(a+ "   222");
            return a;
        }
        else{
            int a = sdacha(n-1)+sdacha(n-3)+sdacha(n-5)+sdacha(n-10);
            System.out.println(a + "  333");
            return a;
        }
        }
    }

