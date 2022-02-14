package Items;

enum ArmorType{
    Cloth,
    Leather,
    Mail,
    Plate
}
public class Armor extends Item{

    //Fields
    private ArmorType armorType;

    //Getters and setters

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }
}
