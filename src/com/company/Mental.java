package com.company;

public class Mental extends ObjectsTemplate implements SPUsable{

    public Mental(int health, int damage){
        this.health = health;
        this.damage = damage;
    }
    @Override
    public String specialAbility(){
        return "Применил супер способность \"Ментальная атака\"";
    }
}
