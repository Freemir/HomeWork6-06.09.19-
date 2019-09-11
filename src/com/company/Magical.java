package com.company;

public class Magical extends ObjectsTemplate implements SPUsable {

    public Magical(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    @Override
    public String specialAbility(){
        return "Применил супер способность \"Магическая атака\"";
    }
}
