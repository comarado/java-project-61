package hexlet.code;
import java.util.Scanner;

public class Greet {
    private static String greeting;

        Greet() {
            this.greeting = greeting;
        }

        public static String greeting() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name?");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            //scanner.close();

            return userName;
        }
    }


