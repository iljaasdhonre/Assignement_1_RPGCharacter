package Items;

import Characters.Slot;

public abstract class Item {

    //Fields
    protected String name;
    protected int level;
    private Slot itemSlot;

    //Getter and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Slot getItemSlot() {
        return itemSlot;
    }

    public void setItemSlot(Slot itemSlot) {
        this.itemSlot = itemSlot;
    }
}
