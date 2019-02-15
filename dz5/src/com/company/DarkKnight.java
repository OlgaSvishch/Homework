package com.company;

public class DarkKnight extends Knight implements ActionPostFight {


    public DarkKnight(String name, int health, int attack, double defense, float shild) {
        super(name, health, attack, defense, shild);
    }


    @Override
    public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
        if (random.nextGaussian() > 0.5) {
            currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
            returnHealthDarkKnight(currenthealth);}
        else currenthealth = arenaFighter1.health;
        return currenthealth;
    }


}
