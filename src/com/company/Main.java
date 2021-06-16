package com.company;

public class Main {

    public static void main(String[] args) {
        for (Hero hero : createHeroes()) {
            System.out.println(" Здоровье " + hero.getHealth() + " " + " Урон " + hero.getDamage() + " " + " суперспособность " + hero.getSuperpower());
        }

        BOSS boss = new BOSS();
        boss.setDamage(50);
        boss.setHealth(200);
        boss.setKinetic("Kinetic");
        System.out.println(" Урон " + boss.getDamage() + " " + " Здоровье "+ boss.getHealth() + " "+" суперспособность " + boss.getKinetic());


    }

    public static Hero[] createHeroes() {
        Hero warrior = new Hero(150, 10, "superAttack");
        Hero archer = new Hero(100, 15,"superArrow");
        Hero Golem = new Hero(200, 5);
        return new Hero[]{warrior, archer, Golem};
    }

}
