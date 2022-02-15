package com.mod.assignment1rpgcharacters.Characters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;
import com.mod.assignment1rpgcharacters.Items.Armor;
import com.mod.assignment1rpgcharacters.Items.ArmorType;
import com.mod.assignment1rpgcharacters.Items.Weapon;
import com.mod.assignment1rpgcharacters.Items.WeaponType;

public class Mage extends Character {


    //Constructor
    public Mage(String name) {
        super(name,
                new PrimaryAttribute(1, 1, 8));
    }

    //Increases level by 1 and update attributes accordingly
    @Override
    public void levelUp() {
        setLevel(this.level += 1);
        updatePrimaryAttributes(1, 1, 5);
    }

    //Returns the characters dps
    @Override
    public double calculateCharacterDPS() {
        double intelligence = totalPrimaryAttribute.getIntelligence();
        if (this.equipment.get(Slot.WEAPON) != null) {
            Weapon weapon = (Weapon) this.equipment.get(Slot.WEAPON);
            this.setCharacterDPS(weapon.getWeaponDPS() * (1 + intelligence / 100));
        } else this.setCharacterDPS(1 + intelligence / 100);
        return this.getCharacterDPS();
    }

    //Checks whether a weapon is suitable to be equipped by this character otherwise throws an exception
    @Override
    public void equipWeapon(Weapon weapon) throws InvalidWeaponException {
        if (weapon.getWeaponType() == WeaponType.WAND
                || weapon.getWeaponType() == WeaponType.STAFF
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
        if (armor.getArmorType() == ArmorType.CLOTH
                && armor.getLevel() <= this.getLevel()) {
            equipment.put(itemSlot, armor);
            updateTotalPrimaryAttributes(armor.getPrimaryAttribute());
        } else {
            throw new InvalidArmorException("You are not allowed to equip this armor!");
        }
    }


}
