import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class TA {

    static Player player;

    public static void main(String[] args) throws Exception {

        // Introduction
        System.out.println("Welcome to Ceres");
        player = new Player();

        while (true) {
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
            player.findItem("Satchel");
        }
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

