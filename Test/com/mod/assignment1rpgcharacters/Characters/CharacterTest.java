package com.mod.assignment1rpgcharacters.Characters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    public void TestCreateCharacter_newCharacterAsMageInitialLevel_ShouldCreateWithLevelOne(){
        //Arrange
        Character myCharacter = new Mage("Merlin") {};
        int expectedLevel = 1;

        //Act
        int actualLevel = myCharacter.getLevel();

        //Assert
        assertEquals(expectedLevel, actualLevel);
    }

    @Test
    public void TestCharacterLevelUp_CharacterIsMageAndHasLevelOne_CharacterLevelShouldGoUpByOne(){
        //Arrange
        Character myCharacter = new Mage("Merlin") {};
        int expectedLevel = 2;

        //Act
        myCharacter.levelUp(1,1,1);
        int actualLevel = myCharacter.getLevel();

        //Assert
        assertEquals(expectedLevel, actualLevel);
    }

    @Test
    public void TestMageIsCreatedWithDefaultAttributes_MageLevelOfAttributesAtInitialization_AttributesAreAtBaseLevel(){
        //Arrange
        Mage myMage = new Mage("Merlin");
        int expectedStrength = 1;
        int expectedDexterity = 1;
        int expectedIntelligence = 8;

        //Act
        int actualStrength = myMage.getPrimaryAttribute().getStrength();
        int actualDexterity = myMage.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myMage.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestRogueIsCreatedWithDefaultAttributes_RogueLevelOfAttributesAtInitialization_AttributesAreAtBaseLevel(){
        //Arrange
        Rogue myRogue = new Rogue("Rogue");
        int expectedStrength = 2;
        int expectedDexterity = 6;
        int expectedIntelligence = 1;

        //Act
        int actualStrength = myRogue.getPrimaryAttribute().getStrength();
        int actualDexterity = myRogue.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myRogue.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestRangerIsCreatedWithDefaultAttributes_RangerLevelOfAttributesAtInitialization_AttributesAreAtBaseLevel(){
        //Arrange
        Ranger myRanger = new Ranger("Ranger");
        int expectedStrength = 1;
        int expectedDexterity = 7;
        int expectedIntelligence = 1;

        //Act
        int actualStrength = myRanger.getPrimaryAttribute().getStrength();
        int actualDexterity = myRanger.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myRanger.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestWarriorIsCreatedWithDefaultAttributes_WarriorLevelOfAttributesAtInitialization_AttributesAreAtBaseLevel(){
        //Arrange
        Warrior myWarrior = new Warrior("Warrior");
        int expectedStrength = 5;
        int expectedDexterity = 2;
        int expectedIntelligence = 1;

        //Act
        int actualStrength = myWarrior.getPrimaryAttribute().getStrength();
        int actualDexterity = myWarrior.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myWarrior.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestMageAttributesIncreaseWhenLevelingUp_MageAttributesAtInitialization_AttributesShouldIncreaseAccordingly(){
        //Arrange
        Mage myMage = new Mage("Merlin");
        int expectedStrength = 2;
        int expectedDexterity = 2;
        int expectedIntelligence = 13;

        //Act
        myMage.levelUp();
        int actualStrength = myMage.getPrimaryAttribute().getStrength();
        int actualDexterity = myMage.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myMage.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestRangerAttributesIncreaseWhenLevelingUp_RangerAttributesAtInitialization_AttributesShouldIncreaseAccordingly(){
        //Arrange
        Ranger myRanger = new Ranger("Ranger");
        int expectedStrength = 2;
        int expectedDexterity = 12;
        int expectedIntelligence = 2;

        //Act
        myRanger.levelUp();
        int actualStrength = myRanger.getPrimaryAttribute().getStrength();
        int actualDexterity = myRanger.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myRanger.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestRogueAttributesIncreaseWhenLevelingUp_RogueAttributesAtInitialization_AttributesShouldIncreaseAccordingly(){
        //Arrange
        Rogue myRogue = new Rogue("Rogue");
        int expectedStrength = 3;
        int expectedDexterity = 10;
        int expectedIntelligence = 2;

        //Act
        myRogue.levelUp();
        int actualStrength = myRogue.getPrimaryAttribute().getStrength();
        int actualDexterity = myRogue.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myRogue.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }

    @Test
    public void TestWarriorAttributesIncreaseWhenLevelingUp_WarriorAttributesAtInitialization_AttributesShouldIncreaseAccordingly(){
        //Arrange
        Warrior myWarrior = new Warrior("Xena");
        int expectedStrength = 8;
        int expectedDexterity = 4;
        int expectedIntelligence = 2;

        //Act
        myWarrior.levelUp();
        int actualStrength = myWarrior.getPrimaryAttribute().getStrength();
        int actualDexterity = myWarrior.getPrimaryAttribute().getDexterity();
        int actualIntelligence = myWarrior.getPrimaryAttribute().getIntelligence();

        //Assert
        assertEquals(expectedStrength, actualStrength);
        assertEquals(expectedDexterity, actualDexterity);
        assertEquals(expectedIntelligence, actualIntelligence);
    }
}