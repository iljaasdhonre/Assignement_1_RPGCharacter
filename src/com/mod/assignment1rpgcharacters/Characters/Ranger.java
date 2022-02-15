package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Items.Item;

public class Ranger extends Character {

    public Ranger(String name) {
        super(name,
                new PrimaryAttribute(1,7,1));
    }

    //Upgrade level of character and set primary attributes with new levels.
    @Override
    void levelUp() {
        setLevel(this.level++);
        updateAttributes(1,5,1);
    }

    @Override
    void equipItem(Item item) {

    }
}
