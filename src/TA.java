import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class TA {
    public static void run() throws Exception {

        // Introduction
        System.out.println("Welcome to Ceres");
        Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
    }

    // Initiating a console command & loop.
    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.startsWith("/")) {
            if (s.equals("/help")) {
                System.out.println("These are your only options.");
                System.out.println("/help   -  You're here now.");
            }
            return nextLine();
        } else {
            return s;
        }
    }
}

