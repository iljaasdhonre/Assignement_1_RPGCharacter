package Items;

enum WeaponType {
    Axe,
    Bow,
    Dagger,
    Hammer,
    Staff,
    Sword,
    Wand
}
public class Weapon extends Item{

    //Fields
    private WeaponType weaponType;
    private double attackSpeed;

    //Getters and setters

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
