package com.company;

import java.util.ArrayList;

public class Player {
    int health = 20;
    int energy = 0;
    ArrayList<Integer> actions = new ArrayList<Integer>();
    void attack(Player enemy){
        enemy.health -= this.energy;
        this.energy = 0;
    }
    void defend(){
        this.health += this.energy;
        this.energy = 0;
    }

    void get_energy(){
        this.energy += 1;
    }

    void set_default(){
        this.health = 20;
        this.energy = 0;
        this.actions = new ArrayList<Integer>();
    }
    void set_actions(ArrayList actions){
        this.actions = actions;
    }

}