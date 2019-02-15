package com.company;

public interface ActionPreFight {
    default void addHealth (double currenthealth){
        currenthealth = currenthealth + currenthealth / 2;
    };
}
