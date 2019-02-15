package com.company;

public class Dragon extends ArenaFighter implements Power {

    int power;

    public Dragon(String name, int health, int attack, double defense, int power) {
        super(name, health, attack, defense);
        this.power = power;
    }


    int powers[] = {fire, earth, water, wind};

    public int getPowerBonus() {
        int count = 0;
        for (int i : powers) {
            count += (power & i) > 0 ? 1 : 0;

        }
        return count;
    }

    @Override
    public void attackArenaFighter(ArenaFighter arenaFighter) {

        int attack = arenaFighter.getAttack() * (1 + getPowerBonus());

    }



    public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {

                currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;

        return currenthealth;


    }


}
