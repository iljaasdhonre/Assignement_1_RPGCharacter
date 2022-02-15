package com.mod.assignment1rpgcharacters.Items;


import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Characters.Slot;

public class Armor extends Item{

    //Fields
    private ArmorType armorType;
    private PrimaryAttribute primaryAttribute;

    //Constructor
    public Armor() {
    }

    //Getters and setters
    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public PrimaryAttribute getPrimaryAttribute() {
        return primaryAttribute;
    }

    public void setPrimaryAttribute(PrimaryAttribute primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }
}
