package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class Prime {
    /*public static String userName;
    public static String gameEven;

    Even() {
        this.userName = userName;
        this.gameEven = gameEven;
    }*/

    public static void gamePrime(String userName) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(1000);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userPrimeAnswer = scanner2.next();

            boolean isSimple = Boolean.parseBoolean(null);


            if (randomNumber < 2) isSimple = false;
            if (randomNumber > 2) {
                for (int m = 2; m < randomNumber / 2; m++) {
                    if (randomNumber % m == 0) {
                        isSimple = false;
                    }
                }
                isSimple = true;
            }

            if ((isSimple == true && userPrimeAnswer.equals("yes")) || (isSimple == false && userPrimeAnswer.equals("no"))) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + userName + "!");
            } else if ((isSimple == true && userPrimeAnswer.equals("no")) || (isSimple == false && userPrimeAnswer.equals("yes"))) {
                System.out.println("'" + userPrimeAnswer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}

    /*public static boolean isSimple(Integer number) {
        if(number < 2) return false;
        for(int i = 2; i < number / 2; i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }*/




