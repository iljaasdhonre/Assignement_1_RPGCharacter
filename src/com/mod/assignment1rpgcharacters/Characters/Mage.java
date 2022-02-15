package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;
import com.mod.assignment1rpgcharacters.Items.Item;
import com.mod.assignment1rpgcharacters.Items.Weapon;

public class Mage extends Character {


    public Mage(String name) {
        super(name,
                new PrimaryAttribute(1, 1, 8));
    }

    @Override
    void levelUp() {
        setLevel(this.level++);
        updateAttributes(1,1,5);
    }

    @Override
    void equipItem(Item item) throws InvalidArmorException, InvalidWeaponException {
    }
}
