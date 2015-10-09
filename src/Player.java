import java.util.Scanner;

public class Player {
    String name;
    String weapon;
    String area;

    // Player states their name.
    public void  chooseName() {
        System.out.println("Hey fucker! What's your name!?");
        name = TA.nextLine();
        System.out.println("Oh, " + name + "? You're the asshole I keep hearing about..");
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
            System.out.println("Prefer to bludgeon, huh? Sick fucko..");
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
            System.out.println("Go ahead then you tree hugging hippie!");
        } else if (areaNum == 2) {
            System.out.println("HAH! You'll die of thirst if nothing kills you first!");
        } else {
            throw new Exception("Are you retarded? Treat your direction just like your weapon choice.");
        }
    }
}
