package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Items.Item;

public class Rogue extends Character {


    public Rogue(String name) {
        super(name,
                new PrimaryAttribute(2,6,1));
    }

    @Override
    void levelUp() {
        setLevel(this.level++);
        updateAttributes(1,4,1);
    }

    @Override
    void equipItem(Item item) {

    }
}
