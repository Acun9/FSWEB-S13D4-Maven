package org.example;

public enum Weapon {
    SWORD(35,1.4),
    AXE(40, 1.2),
    BOW(25,1.8),
    SPEAR(30,1.6);

    private final int damage;
    private final double attackSpeed;

    public int getDamage(){
        return damage;
    }

    public double getAttackSpeed(){
        return attackSpeed;
    }

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }
}
