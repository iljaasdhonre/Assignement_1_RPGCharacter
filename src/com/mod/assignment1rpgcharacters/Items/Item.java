package com.mod.assignment1rpgcharacters.Items;

import com.mod.assignment1rpgcharacters.Characters.Slot;

public abstract class Item {

    //Fields
    private String name;
    private int level;
    private Slot itemSlot;

    //Constructor
    protected Item() {
    }

    protected Item(String name, int level, Slot itemSlot) {
        this.name = name;
        this.level = level;
        this.itemSlot = itemSlot;
    }

    //Getter and setters
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

    public Slot getItemSlot() {
        return itemSlot;
    }

    public void setItemSlot(Slot itemSlot) {
        this.itemSlot = itemSlot;
    }
}
