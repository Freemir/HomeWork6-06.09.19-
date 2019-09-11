package com.company;

public class Warrior extends ObjectsTemplate implements SPUsable {

    public Warrior(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    @Override
    public String specialAbility(){
        return "Применил супер способность \"Физическая атака\"";
    }
}
