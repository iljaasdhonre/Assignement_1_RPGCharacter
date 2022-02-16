package com.mod.assignment1rpgcharacters.Items;

import com.mod.assignment1rpgcharacters.Attributes.PrimaryAttribute;
import com.mod.assignment1rpgcharacters.Characters.Slot;
import com.mod.assignment1rpgcharacters.Characters.Warrior;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidArmorException;
import com.mod.assignment1rpgcharacters.Exceptions.InvalidWeaponException;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    public void TestHighLevelWeaponAgainstLowerLevelCharacter_AxeLevelIsOneAboveWarrior_InvalidWeaponExceptionShouldBeThrown() {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setLevel(2);
        testWeapon.setItemSlot(Slot.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setDamage(7);
        testWeapon.setAttackSpeed(1.1);
        String expectedMessage = "You are not allowed to equip this weapon!";

        //Act
        Exception exception = assertThrows(InvalidWeaponException.class, () -> testWarrior.equipWeapon(testWeapon));
        String actualMessage = exception.getMessage();

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void TestHighLevelArmorAgainstLowerLevelCharacter_ArmorLevelIsOneAboveWarrior_InvalidArmorExceptionShouldBeThrown() {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        testPlateBody.setLevel(2);
        testPlateBody.setItemSlot(Slot.BODY);
        testPlateBody.setArmorType(ArmorType.PLATE);
        testPlateBody.setPrimaryAttribute(new PrimaryAttribute(1, 0, 0));
        String expectedMessage = "You are not allowed to equip this armor!";

        //Act
        Exception exception = assertThrows(InvalidArmorException.class, () -> testWarrior.equipArmor(testPlateBody, testPlateBody.getItemSlot()));
        String actualMessage = exception.getMessage();

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void TestWrongWeaponEquipped_WarriorEquippingBow_InvalidWeaponExceptionShouldBeThrown() {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Weapon testBow = new Weapon();
        testBow.setName("Common Bow");
        testBow.setLevel(1);
        testBow.setItemSlot(Slot.WEAPON);
        testBow.setWeaponType(WeaponType.BOW);
        testBow.setDamage(12);
        testBow.setAttackSpeed(12.0);
        String expectedMessage = "You are not allowed to equip this weapon!";

        //Act
        Exception exception = assertThrows(InvalidWeaponException.class, () -> testWarrior.equipWeapon(testBow));
        String actualMessage = exception.getMessage();

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void TestWrongArmorEquipped_WarriorEquippingCloth_InvalidArmorExceptionShouldBeThrown() {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Armor testClothHead = new Armor();
        testClothHead.setName("Common Cloth Head Armor");
        testClothHead.setLevel(1);
        testClothHead.setItemSlot(Slot.HEAD);
        testClothHead.setArmorType(ArmorType.CLOTH);
        testClothHead.setPrimaryAttribute(new PrimaryAttribute(0, 0, 5));
        String expectedMessage = "You are not allowed to equip this armor!";

        //Act
        Exception exception = assertThrows(InvalidArmorException.class, () -> testWarrior.equipArmor(testClothHead, testClothHead.getItemSlot()));
        String actualMessage = exception.getMessage();

        //Assert
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void TestEquipValidWeapon_AxeEquippedByWarrior_ShouldReturnTrue() throws InvalidWeaponException {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setLevel(1);
        testWeapon.setItemSlot(Slot.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setDamage(7);
        testWeapon.setAttackSpeed(1.1);

        HashMap<Slot, Item> expectedMap = new HashMap<>();
        expectedMap.put(testWeapon.getItemSlot(), testWeapon);

        //Act
        testWarrior.equipWeapon(testWeapon);
        HashMap<Slot, Item> actualMap = testWarrior.getEquipment();

        //Assert
        assertTrue(expectedMap.equals(actualMap));
    }

    @Test
    public void TestEquipValidArmor_PlateEquippedByWarrior_ShouldReturnTrue() throws InvalidArmorException {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        testPlateBody.setLevel(1);
        testPlateBody.setItemSlot(Slot.BODY);
        testPlateBody.setArmorType(ArmorType.PLATE);
        testPlateBody.setPrimaryAttribute(new PrimaryAttribute(1, 0, 0));
        HashMap<Slot, Item> expectedMap = new HashMap<>();
        expectedMap.put(testPlateBody.getItemSlot(), testPlateBody);

        //Act
        testWarrior.equipArmor(testPlateBody, testPlateBody.getItemSlot());
        HashMap<Slot, Item> actualMap = testWarrior.getEquipment();

        //Assert
        assertTrue(expectedMap.equals(actualMap));
    }

    @Test
    public void TestDPSWhenNoWeaponIsEquipped_WarriorLevelOne_ShouldPass() {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        double expectedDPS = 1 * (1 + (5 / 100));

        //Act
        testWarrior.calculateCharacterDPS();
        double actualDPS = testWarrior.getCharacterDPS();

        //Assert
        assertEquals(expectedDPS, actualDPS);
    }

    @Test
    public void TestDPSWithWeaponEquipped_WarriorLevelOneEquippedWithAxe_ShouldPass() throws InvalidWeaponException {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setLevel(1);
        testWeapon.setItemSlot(Slot.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setDamage(7);
        testWeapon.setAttackSpeed(1.1);
        double expectedDPS = (7 * 1.1) * (1 + (5 / 100));

        //Act
        testWarrior.equipWeapon(testWeapon);
        testWarrior.calculateCharacterDPS();
        double actualDPS = testWarrior.getCharacterDPS();

        //Assert
        assertEquals(expectedDPS, actualDPS);
    }

    @Test
    public void TestDPSWithWeaponAndArmorEquipped_WarriorLevelOneEquippedWithAxeAndPlateBody_ShouldPass()
            throws InvalidWeaponException, InvalidArmorException {
        //Arrange
        Warrior testWarrior = new Warrior("Xena");
        Weapon testWeapon = new Weapon();
        testWeapon.setName("Common Axe");
        testWeapon.setLevel(1);
        testWeapon.setItemSlot(Slot.WEAPON);
        testWeapon.setWeaponType(WeaponType.AXE);
        testWeapon.setDamage(7);
        testWeapon.setAttackSpeed(1.1);
        Armor testPlateBody = new Armor();
        testPlateBody.setName("Common Plate Body Armor");
        testPlateBody.setLevel(1);
        testPlateBody.setItemSlot(Slot.BODY);
        testPlateBody.setArmorType(ArmorType.PLATE);
        testPlateBody.setPrimaryAttribute(new PrimaryAttribute(1, 0, 0));
        double expectedDPS = (7 * 1.1) * (1 + ((5+1) / 100));

        //Act
        testWarrior.equipWeapon(testWeapon);
        testWarrior.equipArmor(testPlateBody, testPlateBody.getItemSlot());
        testWarrior.calculateCharacterDPS();
        double actualDPS = testWarrior.getCharacterDPS();

        //Assert
        assertEquals(expectedDPS, actualDPS);
    }


}