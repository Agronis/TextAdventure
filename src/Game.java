import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Game {

    static Player player;

    public static void main(String[] args) throws Exception {

        // Introduction
        System.out.println("Welcome to Ceres");
        player = new Player();


        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
        player.findItem("Satchel");

        Weapon ogreWeapon = new Weapon();
        ogreWeapon.name = "Club";
        ogreWeapon.damage = 5;
        Enemy ogre = new Enemy("Ogre", 120, 20, ogreWeapon);

        player.Battle(ogre);

    }

    // Initiating a console command & loop.
    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("/")) {
            if (s.equals("/help")) {
                System.out.println("These are your only options.");
                System.out.println("/help   -  You're here now.");
            } else if (s.equals("/exit")) {
                System.exit(0);
            } else if (s.equals("/inv")) {
                if (player.items.size() == 1) {
                    System.out.println("You have no items.");
                }
                for (Object item : player.items) {
                    System.out.println(item);
                }
            }
            return nextLine();
        } else {
            return s;
        }
    }
}

