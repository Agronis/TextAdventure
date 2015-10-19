import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Game {

    static Player player;
    static final String FILE_NAME = "save.json";

    public static void main(String[] args) throws Exception {

        // Introduction
        System.out.println("Welcome to Ceres");
        player = loadGame();

        player.findItem("Satchel");
        player.findItem("Shield");

        if (player == null) {
            player = new Player();
            player.chooseName();
            player.chooseWeapon();
            player.chooseArea();
        }

        Weapon ogreWeapon = new Weapon();
        ogreWeapon.name = "Club";
        ogreWeapon.damage = 5;
        Enemy ogre = new Enemy("Ogre", 120, 20, ogreWeapon);

        player.Battle(ogre);

        saveGame();
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
                for (String item : player.items) {
                    System.out.println(item);
                }
            }
            return nextLine();
        } else {
            return s;
        }
    }

    static void saveGame() {
        JsonSerializer serializer = new JsonSerializer();

        String contentToSave = serializer.serialize(player);

        File f = new File(FILE_NAME);

        try {
            FileWriter fw = new FileWriter(f);
            fw.write(contentToSave);
            fw.close();
        } catch (Exception e) {
        }


    }

    static Player loadGame () {
        try {
            File f = new File(FILE_NAME);
            FileReader fr = new FileReader(f);
            int fileSize = (int) f.length();
            char[] contents = new char[fileSize];
            fr.read(contents);
            String fileContents = new String(contents);
            JsonParser parser = new JsonParser();
            System.out.println(fileContents);
            return parser.parse(fileContents, Player.class);
        } catch (Exception e) {
        } return null;
    }
    }

