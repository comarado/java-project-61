package hexlet.code.games;
import java.util.Scanner;
import java.util.Random;


public class Even {
    /*public static String userName;
    public static String gameEven;

    Even() {
        this.userName = userName;
        this.gameEven = gameEven;
    }*/

    public static void gameEven(String userName) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            String userEvenAnswer = scanner2.next();

            if ((randomNumber % 2 == 0 && userEvenAnswer.equals("yes")) || (randomNumber % 2 != 0 && userEvenAnswer.equals("no"))) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if (randomNumber % 2 == 0 && userEvenAnswer.equals("no")) {
                System.out.println("'" + userEvenAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else if (randomNumber % 2 != 0 && userEvenAnswer.equals("yes")) {
                System.out.println("'" + userEvenAnswer + "' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                break;

            }
        }
    }
}

