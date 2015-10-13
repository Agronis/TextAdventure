import java.util.ArrayList;

public class Player extends Char {
    String weapon;
    String area;
    ArrayList items = new ArrayList();

    public Player() {
        health = 100;
        damage = 20;
    }

    // Player states their name.
    public void  chooseName() {
        System.out.println("Hey! What's your name!?");
        name = TA.nextLine();
        System.out.println("Oh, " + name + "? You're the guy I keep hearing about..");
    }

    // Player chooses a weapon.
    public void chooseWeapon() throws Exception {
        System.out.println("Choose a weapon - you'll need it.");
        System.out.println("[1] Pick up a sword.");
        System.out.println("[2] Pick up a mallet.");
        weapon = TA.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("A little dull but it'll have to do.");
        } else if (weaponNum == 2) {
            System.out.println("Prefer to bludgeon, huh? Sicko..");
        } else {
            throw new Exception("Maybe it wasn't obvious, just choose a number.");
        }
    }

    // Player chooses an area.
    public void chooseArea() throws Exception {
        System.out.println("Pick your path to death.");
        System.out.println("[1] Enter the forest.");
        System.out.println("[2] Enter the barren canyon.");
        area = TA.nextLine();
        int areaNum = Integer.valueOf(area);
        if (areaNum == 1) {
            System.out.println("Go play in the forest you fairy!");
        } else if (areaNum == 2) {
            System.out.println("HAH! You'll die of thirst if nothing kills you first!");
        } else {
            throw new Exception("Are you retarded? Treat your direction just like your weapon choice.");
        }
    }

    // When a player finds an item & option to add to inventory.
    void findItem(String item) {
        System.out.println("Found a new item! Do you want to pick it up?? [Y/N]");
        String s = TA.nextLine();
        if (s.equals("Y")) {
            System.out.println("You found a " + item);
            items.add(item);
        }
    }
}
