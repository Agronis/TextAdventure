import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by Agronis on 10/8/15.
 */
public class TA {
    public static void run() throws Exception {
        System.out.println("Welcome to Ceres");
        System.out.println("Hey fucker! What's your name!?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Oh, " + name + "? You're the asshole I keep hearing about..");
        System.out.println("Choose a weapon - you'll need it.");

        System.out.println("[1] Pick up a sword.");
        System.out.println("[2] Pick up a mallet.");
        String weapon = scanner.nextLine();
        int weaponNum = Integer.valueOf(weapon);
        if (weaponNum == 1) {
            System.out.println("A little dull but it'll have to do.");
        } else if (weaponNum == 2) {
            System.out.println("Prefer to bludgeon, huh? Sick fucko..");
        } else {
            throw new Exception("Maybe I wasn't clear, just choose a number.");
        }

        System.out.println("Choose a direction fool.");
        System.out.println("[1] Enter the forest.");
        System.out.println("[2] Enter the barren canyon.");
        String area = scanner.nextLine();
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
