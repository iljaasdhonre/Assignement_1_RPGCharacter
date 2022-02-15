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
public class Weapon extends Item{

    //Fields
    private WeaponType weaponType;
    private double attackSpeed;

    //Constructor
    public Weapon() {
    }

    public Weapon(String name, int level, Slot itemSlot, WeaponType weaponType, double attackSpeed) {
        super(name, level, itemSlot);
        this.weaponType = weaponType;
        this.attackSpeed = attackSpeed;
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
}
