package com.mod.assignment1rpgcharacters.Items;

public class Weapon extends Item {

    //Fields
    private WeaponType weaponType;
    private int damage;
    private double attackSpeed;
    private double weaponDPS;

    //Constructor
    public Weapon() {
    }

    //Getters and setters
    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() { return damage; }

    public void setDamage(int damage) { this.damage = damage; }

    public double getWeaponDPS() { return this.weaponDPS; }

    public void setWeaponDPS() { this.weaponDPS = getDamage() * getAttackSpeed(); }
}
