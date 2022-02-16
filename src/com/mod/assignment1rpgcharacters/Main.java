package com.mod.assignment1rpgcharacters;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Characters.Mage;
import com.mod.assignment1rpgcharacters.Characters.Slot;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;
import com.mod.assignment1rpgcharacters.Items.Armor;
import com.mod.assignment1rpgcharacters.Items.ArmorType;
import com.mod.assignment1rpgcharacters.Items.Weapon;
import com.mod.assignment1rpgcharacters.Items.WeaponType;

public class Main {

    public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {
        // write your code here

        Mage myMage = new Mage("Merlin");
        myMage.levelUp();

        Weapon weapon = new Weapon();
            weapon.setDamage(7);
            weapon.setWeaponType(WeaponType.STAFF);
            weapon.setAttackSpeed(2.0);
            weapon.setLevel(2);
            weapon.setItemSlot(Slot.WEAPON);
            weapon.setName("Magic Staff");

        Armor clothBody = new Armor();
            clothBody.setArmorType(ArmorType.CLOTH);
            clothBody.setItemSlot(Slot.BODY);
            clothBody.setLevel(1);
            clothBody.setName("Invisible cloak");
            clothBody.setPrimaryAttribute(new PrimaryAttribute(1, 1, 5));

        Armor clothHead = new Armor();
            clothHead.setArmorType(ArmorType.CLOTH);
            clothHead.setItemSlot(Slot.HEAD);
            clothHead.setLevel(2);
            clothHead.setName("Mithril");
            clothHead.setPrimaryAttribute(new PrimaryAttribute(1, 1, 2));

        myMage.equipWeapon(weapon);
        myMage.equipArmor(clothBody, clothBody.getItemSlot());
        myMage.equipArmor(clothHead, clothHead.getItemSlot());
        myMage.calculateCharacterDPS();

       System.out.println(myMage.getDetails());




    }
}
