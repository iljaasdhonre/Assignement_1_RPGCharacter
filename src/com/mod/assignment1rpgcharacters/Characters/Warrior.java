package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Items.Item;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name,
                new PrimaryAttribute(5,2,1));
    }

    @Override
    void levelUp() {
        setLevel(this.level++);
        updateAttributes(3,2,1);
    }

    @Override
    void equipItem(Item item) {

    }
}
