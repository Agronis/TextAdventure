import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by Agronis on 10/8/15.
 */
public class TA {
    public static void run() throws Exception {
        System.out.println("Welcome to Ceres");  // Introduction

        Player player = new Player();
        player.chooseName();
        player.chooseWeapon();
        player.chooseArea();
    }
}

