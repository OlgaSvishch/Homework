package com.company;

public class Vampir extends ArenaFighter implements ActionPostFight, ActionPreFight {

    public Vampir(String name, int health, int attack, double defense) {
        super(name, health, attack, defense);
    }

    @Override
    public void attackArenaFighter(ArenaFighter arenaFighter) {
        int attack = arenaFighter.getAttack();
    }



    @Override
    public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
        currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
        returnHealthVampir(currenthealth);
        return currenthealth;
    }


}
