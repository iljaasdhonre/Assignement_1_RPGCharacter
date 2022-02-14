package Characters;

import Attributes.PrimaryAttribute;

public class Ranger extends Character{

    public Ranger(String name) {
        super(name,
                new PrimaryAttribute(1,7,1));
    }

    @Override
    void levelUp() {

    }
}
