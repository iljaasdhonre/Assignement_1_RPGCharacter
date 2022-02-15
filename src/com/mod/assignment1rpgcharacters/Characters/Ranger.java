package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;

public class Ranger extends Character {

    public Ranger(String name) {
        super(name,
                new PrimaryAttribute(1,7,1));
    }

    @Override
    void levelUp() {

    }
}
