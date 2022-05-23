package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<ArrayList<Integer>> data1 = new ArrayList<ArrayList<Integer>>();

    static ArrayList<ArrayList<Integer>> data2 = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        Player player1 = new Player();
        setList(data1);
        setList(data2);
        Player player2 = new Player();
        System.out.println(choosingBestFromTwoArrays(player1,player2));
        }
        static ArrayList choosingBestFromTwoArrays(Player player1, Player player2){
            while(data1.size() > 1 && data2.size() > 1){
                player1.set_actions(data1.get(0));
                player2.set_actions(data2.get(0));
                System.out.println("Data1.size()- "+ data1.size() + " data2.size() - "+ data2.size());
                System.out.println("Data 1 - "+ data1);
                System.out.println("Data 2 - "+ data2);
                switch (battle(player1,player2)){
                    case 1:{
                        data2.remove(0);
                        break;
                    }
                    case 2:{
                        data1.remove(0);
                        break;
                    }
                    case 3:
                        data1.remove(0);
                        data2.remove(0);
                        break;
                }
                if(data1.size() <= 1 && data2.size() <= 1){
                    return data1.get(0);
                }
                if(data1.size() == 1 ){
                allAdd(data1,data2);
                }
                if(data2.size() == 1){
                    allAdd(data2,data1);
                }

                player1.set_default();
                player2.set_default();
            }
            return new ArrayList();
        }




    public static byte battle(Player player1,Player player2){
        int i = 0;
        int turn = 1;
        while(player1.health > 0 && player2.health > 0 && turn < 3000){
            if(i > 9){
                i = 0;
            }
            choose(player1,player2,player1.actions.get(i));
            choose(player2,player1,player2.actions.get(i));
            i++;
            turn ++;
        }
        if (turn < 3000){
            if(player1.health > player2.health){
                return 1;
            }
            return 2;
        }
        return 3;
    }

    public static void  choose(Player player1,Player player2,int num){
        if (num == 1){
            player1.attack(player2);
        }
        if(num == 2){
            player1.defend();
        }
        if(num==3){
            player1.get_energy();
        }
    }
    public static ArrayList<Integer> set_player(){
        Random generator = new Random();
        ArrayList<Integer> actions = new ArrayList<Integer>();
        for (int i = 0; i< 10;i++){
            actions.add(generator.nextInt(4-1)+1);
        }
        return actions;
    }
    public static void setList(ArrayList<ArrayList<Integer>> data){
        for(int i = 0; i< 5; i++){
            data.add(set_player());
        }
    }
    public static void allAdd(ArrayList<ArrayList<Integer>> in ,ArrayList<ArrayList<Integer>> out){
        for(int i = out.size()-1; i >= 0; i --){
            in.add(out.get(i));
        }
    }
    public static ArrayList<ArrayList<Integer>> reverse(ArrayList<ArrayList<Integer>> arr){
        ArrayList<ArrayList<Integer>> tmp = new ArrayList<>();
        for (int i = arr.size()-1; i >= 0;i --){
            tmp.add(arr.get(i));
        }
        return tmp;

    }




}