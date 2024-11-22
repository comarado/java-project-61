package hexlet.code;
import java.util.Scanner;

import hexlet.code.*;

//import hexlet.code.games;

public class Engine {
    /*public static String userName;
    //public static String gameEngine;

    Engine() {
        this.userName = userName;
        //this.gameEngine = gameEngine;*/

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        String userChoose = scanner.next();


        if (userChoose.equals("2")) {
            String userName = hexlet.code.Greet.greeting();
            System.out.println("SUKI SUKI SUKI SUKI");
            hexlet.code.games.Even.gameEven(userName);
        } else if (userChoose.equals("1")) {
            String userName = hexlet.code.Greet.greeting();
        }
        else if (userChoose.equals("3")) {
            String userName = hexlet.code.Greet.greeting();
            hexlet.code.games.Calc.gameCalc(userName);
        } else if (userChoose.equals("4")) {
            String userName = hexlet.code.Greet.greeting();
            hexlet.code.games.GCD.gameGCD(userName);
        } else if (userChoose.equals("5")) {
            String userName = hexlet.code.Greet.greeting();
            hexlet.code.games.Progression.gameProgression(userName);
        }
    }
}





