# Assignement_1_RPGCharacter
Java Assignment 1 creating RPG characters, is a console application in which you can create RPG characters and equip them with weapons and armor. 
This assignment is the first of many in a Java Full stack developers course.

## Installation
To run this application you need a Java Development Kit and IDE installed on your computer. 

## Usage
In the src/com/mod/assignment1rpgcharacters folder you can run the main method from the Main class.
Tests are included in the Test folder.

```Java
public static void main(String[] args) throws InvalidWeaponException, InvalidArmorException {
        //Create a new character with required name
        Mage myMage = new Mage("Merlin");
        
        //Up the characters level
        myMage.levelUp();

        //create a new weapon and set it's fields
        Weapon weapon = new Weapon();
            weapon.setDamage(7);
            weapon.setWeaponType(WeaponType.STAFF);
            weapon.setAttackSpeed(2.0);
            weapon.setLevel(2);
            weapon.setItemSlot(Slot.WEAPON);
            weapon.setName("Magic Staff");
        
        //Equip the weapon    
        myMage.equipWeapon(weapon);
        
        //Calculate the characters damage per second (DPS)
        myMage.calculateCharacterDPS();

        //Print the characters details on the console
        System.out.println(myMage.getDetails());
    }
```
## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
