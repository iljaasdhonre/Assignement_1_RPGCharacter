package Characters;

import Attributes.PrimaryAttribute;

public class Rogue extends Character{


    public Rogue(String name) {
        super(name,
                new PrimaryAttribute(2,6,1));
    }

    @Override
    void levelUp() {

    }
}
