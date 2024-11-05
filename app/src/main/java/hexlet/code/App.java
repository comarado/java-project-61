package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String userChoose = scanner.next();
        System.out.println("Your choice: " + userChoose);

        if (userChoose.equals("2")) {
            String userName = Greet.greeting();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                int randomNumber = random.nextInt(100);
                System.out.println("Question: " + randomNumber);
                String userEvenAnswer = scanner2.next();
                //System.out.println("Папа молодец!  " + userEvenAnswer);

                if ((randomNumber % 2 == 0 && userEvenAnswer.equals("yes")) || (randomNumber % 2 != 0 && userEvenAnswer.equals("no"))) {
                    System.out.println("Correct!");
                    if (i == 2) {
                        System.out.println("Congratulations, " + userName);
                    }
                } else break;

                //
            }


        }
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

