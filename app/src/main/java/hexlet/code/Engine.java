package hexlet.code;
import java.util.Scanner;
import java.util.Random;
import hexlet.code.games.*;

public class Engine {
    /*public static String userName;
    public static String gameEngine;

    Engine() {
        this.userName = userName;
        this.gameEngine = gameEngine;*/

        public static void main(String args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("0 - Exit");
            String userChoose = scanner.next();
            System.out.println("Your choice: " + userChoose);

            if (userChoose.equals("2")) {
                String userName = Greet.greeting();
                hexlet.code.games.Even.gameEven(userName);
            } else if (userChoose.equals("1")) Greet.greeting();
            else if (userChoose.equals("3")) {
                String userName = Greet.greeting();
                hexlet.code.games.Calc.gameCalc(userName);
            } else if (userChoose.equals("4")) {
                String userName = Greet.greeting();
                hexlet.code.games.GCD.gameGCD(userName);
            }
        }
    }




