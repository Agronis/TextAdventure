/**
 * Created by Agronis on 10/13/15.
 */
public class Enemy extends Character {

    public Enemy(String name, int health, int damage, Weapon weapon) {

        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weapon = weapon;

    }
}
