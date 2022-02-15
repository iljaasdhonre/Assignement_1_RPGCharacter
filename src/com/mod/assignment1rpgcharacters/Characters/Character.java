package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;
import com.mod.assignment1rpgcharacters.Items.Item;
import com.mod.assignment1rpgcharacters.Items.Weapon;

import java.util.HashMap;

// base class for all characters
public abstract class Character{

    //Fields
    protected String name;
    protected int level;
    protected int totalPrimaryAttributes;
    protected HashMap<Slot, Item> equipment;
    protected PrimaryAttribute primaryAttribute;
    protected double characterDPS;

    //Constructor
    public Character(String name, PrimaryAttribute primaryAttribute) {
        this.name = name;
        this.level = 1;
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

    public int getTotalPrimaryAttributes() {
        return totalPrimaryAttributes;
    }

    public void setTotalPrimaryAttributes(int totalPrimaryAttributes) {
        this.totalPrimaryAttributes = totalPrimaryAttributes;
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

    public double getCharacterDPS() { return characterDPS; }

    public void setCharacterDPS(double characterDPS) { this.characterDPS = characterDPS; }

    //Methods
    abstract void levelUp();

    abstract void equipItem(Item item) throws InvalidArmorException, InvalidWeaponException;

    void updateAttributes(int strength, int dexterity, int intelligence){
        setPrimaryAttribute(new PrimaryAttribute(
                this.primaryAttribute.getStrength() + strength,
                this.primaryAttribute.getDexterity() + dexterity,
                this.primaryAttribute.getIntelligence() + intelligence)
        );
    }

    public void calculateDPS() {
        if(this.equipment.get(Slot.WEAPON) != null){
            Weapon weapon = (Weapon) this.equipment.get(Slot.WEAPON);
            this.setCharacterDPS(weapon.getWeaponDPS() * (1+totalPrimaryAttributes/100));
        }
        else this.setCharacterDPS(1+totalPrimaryAttributes/100);
    }


}
