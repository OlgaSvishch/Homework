package com.company;

public interface ActionPostFight {

    default void returnHealthDarkKnight(double currenthealth) {
        currenthealth = currenthealth + currenthealth / 2 ;
    }

    default void returnHealthVampir(double currenthealth) {
        currenthealth = currenthealth * 2;
    }
    default void returnHealthElemental(double currenthealth) {
        currenthealth = currenthealth + currenthealth * 2;
    }

}
