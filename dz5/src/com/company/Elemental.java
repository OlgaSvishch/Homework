package com.company;

public class Elemental extends ArenaFighter implements ActionPostFight, IsPower{


    int power;

    public Elemental(String name, int health, int attack, double defense, int power) {
        super(name, health, attack, defense);
        this.power = power;
    }
    @Override
    public void attackArenaFighter(ArenaFighter arenaFighter)
    {
        int attack = arenaFighter.getAttack ();
    }


    public double takeDamage(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {
        if (arenaFighter2 instanceof Dragon) {isPower(arenaFighter1, arenaFighter2);

        if (isPower(arenaFighter1, arenaFighter2) == 1) {
            currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
            returnHealthElemental(currenthealth);
        }
        else currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;}
        else currenthealth = arenaFighter1.health - arenaFighter2.attack * arenaFighter1.defense;
        return currenthealth;
    }


}
