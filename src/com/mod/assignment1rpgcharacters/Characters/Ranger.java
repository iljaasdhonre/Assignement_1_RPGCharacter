package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;
import com.mod.assignment1rpgcharacters.Items.*;

public class Ranger extends Character {

    //Constructor
    public Ranger(String name) {
        super(name,
                new PrimaryAttribute(1, 7, 1));
    }

    //Increases level by 1 and update attributes accordingly by calling super.levelUp()
    public void levelUp() {
        levelUp(1, 5, 1);
    }

    //Returns the characters dps by calling super.calculateCharacterDPS()
    public void calculateCharacterDPS() {
        calculateCharacterDPS(totalPrimaryAttribute.getDexterity());
    }

    //Checks whether a weapon is suitable to be equipped by this character otherwise throws an exception
    @Override
    public void equipWeapon(Weapon weapon) throws InvalidWeaponException {
        if (weapon.getWeaponType() == WeaponType.BOW
                && weapon.getLevel() <= this.getLevel()) {
            weapon.setWeaponDPS();
            equipment.put(Slot.WEAPON, weapon);
        } else {
            throw new InvalidWeaponException("You are not allowed to equip this weapon!");
        }
    }

    //Checks whether an armor is suitable to be equipped by this character otherwise throws an exception
    @Override
    public void equipArmor(Armor armor, Slot itemSlot) throws InvalidArmorException {
        if (armor.getArmorType() == ArmorType.LEATHER
                || armor.getArmorType() == ArmorType.MAIL
                && armor.getLevel() <= this.getLevel()) {
            equipment.put(itemSlot, armor);
            updateTotalPrimaryAttributes(armor.getPrimaryAttribute());
        } else {
            throw new InvalidArmorException("You are not allowed to equip this armor!");
        }
    }
}
