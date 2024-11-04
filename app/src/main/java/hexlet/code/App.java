package hexlet.code;

import java.util.Scanner;
//import hexlet.code.Cli;

public class App {
    public static void main(String[] args) {
        Cli.greeting();
    }

    static class Cli {
        public static void greeting() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");

            scanner.close();
        }
    }
}
