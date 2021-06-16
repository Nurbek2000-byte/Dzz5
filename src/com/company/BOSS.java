package com.company;

public class BOSS {
    private int health;
    private int damage;
    private String kinetic;

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){return health;}

    public void setDamage(int damage){
        this.damage = damage;
    }
    public int getDamage(){return damage;}

    public void setKinetic(String kinetic){
        this.kinetic = kinetic;
    }
    public String getKinetic(){return kinetic;}
}