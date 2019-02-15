package com.company;

public interface IsPower {

    default int isPower(ArenaFighter arenaFighter1, ArenaFighter arenaFighter2) {

        int ispower = 0;

        if ((arenaFighter1.power & arenaFighter2.power) > 0) ispower = 1;
        else ispower = 0;
        return ispower;
    }
}
