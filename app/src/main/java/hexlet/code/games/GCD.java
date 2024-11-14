package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class GCD {
    public static String userName;
    public static String gameGCD;

    GCD() {
        this.userName = userName;
        this.gameGCD = gameGCD;
    }

    public static void gameGCD(String userName) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            int a = randomNumber;
            int b = randomNumber2;


            // Пока одно из чисел не станет равным 0
            while (b != 0) {
                int remainder = a % b;  // Остаток от деления
                a = b;  // Обновляем a
                b = remainder;  // Обновляем b
            }
            int count = a;  // Когда b станет 0, a будет НОД

            System.out.println("Question: " + randomNumber + " " + randomNumber2);
            String userGCDAnswer = scanner2.next();

            if (count == Integer.parseInt(userGCDAnswer)) {
                System.out.println("Correct!");
                if (i == 2) System.out.println("Congratulations, " + userName + "!");
            } else if (count != Integer.parseInt(userGCDAnswer)) {
                System.out.println("'" + userGCDAnswer + "' is wrong answer ;(. Correct answer was '" + count + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }
    }
}


