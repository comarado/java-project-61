package hexlet.code;

import java.util.Scanner;
//import hexlet.code.Cli;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        String userChoose = scanner.next();
        System.out.println("Your choice: " + userChoose);

        if (userChoose.equals("1")) {
            Greet.greeting();
        }
    }

    static class Greet {
        public static void greeting() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            //String userName = scanner.next();
            System.out.println("Hello, " + scanner.next() + "!");

            scanner.close();
        }
    }

    /*static class Cli {
        public static void greeting() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            //String userName = scanner.next();
            System.out.println("Hello, " + scanner.next() + "!");

            scanner.close();
        }
    }*/
}
