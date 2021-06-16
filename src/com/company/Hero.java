package com.company;

public class Hero {
  private int health;
  private int damage;
  private String superpower;

  public Hero(int health, int damage, String superpower) {
    this.health = health;
    this.damage = damage;
    this.superpower = superpower;
  }

  public Hero(int health, int damage) {
    this.health = health;
    this.damage = damage;
  }

  public void setHealth(int health){
    this.health = health;
  }
  public int getHealth(){return health;}

  public void setDamage(int damage){
    this.damage = damage;
  }
  public int getDamage(){return damage;}

  public void  setSuperpower(String superpower){
    this.superpower = superpower;
  }
  public String getSuperpower(){return superpower;}


}
