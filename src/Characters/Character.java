package Characters;

import Attributes.PrimaryAttribute;
import Items.Item;

import java.util.HashMap;

// base class for all characters
abstract class Character {

    //Fields
    protected String name;
    protected int level;
    protected int totalPrimaryAttributes;
    protected HashMap<Slot, Item> equipment;
    protected PrimaryAttribute primaryAttribute;

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

    //Methods
    abstract void levelUp();


}
