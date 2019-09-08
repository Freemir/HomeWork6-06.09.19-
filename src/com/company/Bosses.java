package com.company;

import java.util.Random;

public class Bosses extends ObjectsTemplate {



    public Bosses(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public static int random() {
        Random rand = new Random();
        return rand.nextInt(3)+1;
    }
    public static String generateRandomBossDebilityType() {
        switch (random()) {
            case 1:
                bossDebilityType = "Physical";
                break;
            case 2:
                bossDebilityType = "Magical";
                break;
            case 3:
                bossDebilityType = "Mental";
                break;
        }
        return bossDebilityType;
    }


    static String bossDebilityType = generateRandomBossDebilityType();
}