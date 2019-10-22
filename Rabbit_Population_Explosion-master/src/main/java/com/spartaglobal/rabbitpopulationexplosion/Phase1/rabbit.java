package com.spartaglobal.rabbitpopulationexplosion.Phase1;

import java.util.Date;

public abstract class rabbit implements IRabbit{
    private boolean isAlive = true;
    private int agelimit;
    private int breedingAge;
    private int age;

    public rabbit (int ageLimit, int breedingAge){
        this.agelimit = ageLimit;
        this.breedingAge = breedingAge;
    }

    public int getAge(){
        return age;
    }

    public void grow(){
        age++;
        if ( age >= agelimit){
            die();
        }
    }

    public void die(){
        isAlive = false;
    }

    public boolean isAlive(){
        return isAlive;
    }

    public boolean isBreedAble(){
        return age >= breedingAge;
    }

}
