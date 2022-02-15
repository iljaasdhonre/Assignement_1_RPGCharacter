package com.mod.assignment1rpgcharacters.Items;

import com.mod.assignment1rpgcharacters.Characters.Slot;

enum WeaponType {
    Axe,
    Bow,
    Dagger,
    Hammer,
    Staff,
    Sword,
    Wand
}

public class Weapon extends Item {

    //Fields
    private WeaponType weaponType;
    private int damage;
    private double attackSpeed;
    private double weaponDPS;

    //Constructor
    public Weapon() {
    }

    public Weapon(String name, int level, Slot itemSlot, WeaponType weaponType, int damage, double attackSpeed, double weaponDPS) {
        super(name, level, itemSlot);
        this.weaponType = weaponType;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.weaponDPS = weaponDPS;
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

    public double getWeaponDPS() { return getDamage() * getAttackSpeed(); }



}
