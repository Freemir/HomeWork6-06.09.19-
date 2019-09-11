package com.company;

public class Main {

    public static void main(String[] args) {

        Bosses boss = new Bosses(700, 50);
        System.out.println("Boss health = " + boss.health + "\nBoss damage = " + boss.damage + "\nBoss Debility Type = " + Bosses.bossDebilityType);
        System.out.println();
        Warrior warrior = new Warrior(250, 20);
        System.out.println("Warrior health = " + warrior.health + "\nWarrior damage = " + warrior.damage + "\nWarrior special ability = " + warrior.specialAbility());
        System.out.println();
        Magical magical = new Magical(250, 20);
        System.out.println("Magical health = " + magical.health + "\nMagical damage = " + magical.damage + "\nMagical special ability = " + magical.specialAbility());
        System.out.println();
        Mental mental = new Mental(250, 20);
        System.out.println("Mental health = " + mental.health + "\nMental damage = " + mental.damage + "\nMental special ability = " + mental.specialAbility());
}
}
