abstract class Character {
    protected Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public abstract void attack();
}

interface Weapon {
    void use();
}

class Sword implements Weapon {
    public void use() {
        System.out.println("Using a sword");
    }
}

class Bow implements Weapon {
    public void use() {
        System.out.println("Using a bow");
    }
}

class Knight extends Character {
    public void attack() {
        System.out.print("Knight attacks: ");
        weapon.use();
    }
}

class Archer extends Character {
    public void attack() {
        System.out.print("Archer attacks: ");
        weapon.use();
    }
}

public class Main {
    public static void main(String[] args) {
        Character knight = new Knight();
        Weapon sword = new Sword();
        knight.setWeapon(sword);
        knight.attack();

        Character archer = new Archer();
        Weapon bow = new Bow();
        archer.setWeapon(bow);
        archer.attack();
    }
}
