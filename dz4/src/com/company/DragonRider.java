package com.company;

public class DragonRider extends ArenaFighter {

    Dragon dragonPet = null;

    public DragonRider(String name, int health, int attack, double defense) {
        super(name, health, attack, defense);
    }

    @Override
    public void attackArenaFighter(ArenaFighter arenaFighter){
        if (arenaFighter instanceof Dragon) {
            dragonPet = (Dragon) arenaFighter;
            setAttack (dragonPet.getAttack());
        }
    }
}
