package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;
import com.mod.assignment1rpgcharacters.Items.Armor;
import com.mod.assignment1rpgcharacters.Items.Item;
import com.mod.assignment1rpgcharacters.Items.Weapon;

import java.util.HashMap;
import java.util.Map;

// base class for all characters
public abstract class Character {

    //Fields
    protected String name;
    protected int level;
    protected PrimaryAttribute totalPrimaryAttribute;
    protected HashMap<Slot, Item> equipment;
    protected PrimaryAttribute primaryAttribute;
    protected double characterDPS;

    //Constructor
    public Character(String name, PrimaryAttribute primaryAttribute) {
        this.name = name;
        this.level = 1;
        this.equipment = new HashMap<Slot, Item>();
        this.primaryAttribute = primaryAttribute;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public PrimaryAttribute getTotalPrimaryAttribute() {
        return totalPrimaryAttribute;
    }

    public void setTotalPrimaryAttribute(PrimaryAttribute totalPrimaryAttribute) {
        this.totalPrimaryAttribute = totalPrimaryAttribute;
    }

    public HashMap<Slot, Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(HashMap<Slot, Item> equipment) {
        this.equipment = equipment;
    }

    public PrimaryAttribute getPrimaryAttribute() {
        return primaryAttribute;
    }

    public void setPrimaryAttribute(PrimaryAttribute primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public double getCharacterDPS() {
        return characterDPS;
    }

    public void setCharacterDPS(double characterDPS) {
        this.characterDPS = characterDPS;
    }

    //Methods

    abstract void equipWeapon(Weapon weapon) throws InvalidWeaponException;

    abstract void equipArmor(Armor armor, Slot itemSlot) throws InvalidArmorException;

    //Increase the level of character by 1 and update the attributes accordingly with given parameters
    void levelUp(int strength, int dexterity, int intelligence) {
        setLevel(this.level += 1);
        updatePrimaryAttributes(strength, dexterity, intelligence);
    }

    //Update the PRIMARY attributes of character with given parameters
    void updatePrimaryAttributes(int strength, int dexterity, int intelligence) {
        setPrimaryAttribute(new PrimaryAttribute(
                this.primaryAttribute.getStrength() + strength,
                this.primaryAttribute.getDexterity() + dexterity,
                this.primaryAttribute.getIntelligence() + intelligence)
        );
    }

    //Update the TOTAL primary attributes of character with given attributes
    void updateTotalPrimaryAttributes(PrimaryAttribute armorPrimaryAttribute) {
        setTotalPrimaryAttribute(new PrimaryAttribute(
                this.primaryAttribute.getStrength() + armorPrimaryAttribute.getStrength(),
                this.primaryAttribute.getDexterity() + armorPrimaryAttribute.getDexterity(),
                this.primaryAttribute.getIntelligence() + armorPrimaryAttribute.getIntelligence())
        );
    }

    double calculateCharacterDPS(double totalMainAttribute) {
        if (this.equipment.get(Slot.WEAPON) != null) {
            Weapon weapon = (Weapon) this.equipment.get(Slot.WEAPON);
            this.setCharacterDPS(weapon.getWeaponDPS() * (1 + totalMainAttribute / 100));
        } else this.setCharacterDPS(1 + totalMainAttribute / 100);

        return this.getCharacterDPS();
    }

    public String getDetails() {
        StringBuilder detailsString = new StringBuilder();

        return detailsString.append(
                "Character: " + this.getName() + "\n" +
                        "Level: " + this.getLevel() + "\n" +
                        "Strength: " + this.getTotalPrimaryAttribute().getStrength() + "\n" +
                        "Dexterity: " + this.getTotalPrimaryAttribute().getDexterity() + "\n" +
                        "Intelligence: " + this.getTotalPrimaryAttribute().getIntelligence() + "\n" +
                        "DPS: " + this.getCharacterDPS()).toString();
    }
}
