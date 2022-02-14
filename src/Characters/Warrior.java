package Characters;

import Attributes.PrimaryAttribute;

public class Warrior extends Character{
    public Warrior(String name) {
        super(name,
                new PrimaryAttribute(5,2,1));
    }

    @Override
    void levelUp() {

    }
}
