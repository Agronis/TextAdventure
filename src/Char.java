/**
 * Created by Agronis on 10/13/15.
 */
public class Char {
    String name;
    int health;
    int damage;

    void Battle(Char opponent) {
        while (health > 0 && opponent.health > 0) {
            health -= opponent.damage;
            opponent.health -= damage;
        }

        String dead = "%s has been killed.";

        if (health <= 0) {
            System.out.println(String.format(dead, name));
        }

        if (opponent.health <= 0) {
            System.out.println((String.format(dead, opponent.name)));
        }


    }


}
