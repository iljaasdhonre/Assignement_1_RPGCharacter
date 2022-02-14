package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;

public class Mage extends Character {


    public Mage(String name) {
        super(name,
                new PrimaryAttribute(1,1,8));
    }

    @Override
    void levelUp() {

    }
}
