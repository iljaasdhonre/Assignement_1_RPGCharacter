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

        Weapon weapon = new Weapon();
        weapon.setDamage(7);
        weapon.setWeaponType(WeaponType.STAFF);
        weapon.setAttackSpeed(2.0);
        weapon.setLevel(2);
        weapon.setItemSlot(Slot.WEAPON);
        weapon.setName("DeagleWand");

        Armor armor = new Armor();
        armor.setArmorType(ArmorType.CLOTH);
        armor.setItemSlot(Slot.BODY);
        armor.setLevel(2);
        armor.setName("Mithril");
        armor.setPrimaryAttribute(new PrimaryAttribute(1, 1, 5));

        Mage myMage = new Mage("Merlin");

        myMage.levelUp();

        myMage.equipWeapon(weapon);

        myMage.equipArmor(armor, armor.getItemSlot());

        myMage.calculateCharacterDPS();

        System.out.println(myMage.getDetails());

    }
}
