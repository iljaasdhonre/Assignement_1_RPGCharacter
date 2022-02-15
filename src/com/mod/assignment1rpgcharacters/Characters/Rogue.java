package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;

public class Rogue extends Character {


    public Rogue(String name) {
        super(name,
                new PrimaryAttribute(2,6,1));
    }

    @Override
    void levelUp() {

    }
}
