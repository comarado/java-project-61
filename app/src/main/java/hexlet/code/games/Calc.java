package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;


public class Calc {
    public static String userName;
    public static String gameCalc;

    Calc() {
        this.userName = userName;
        this.gameCalc = gameCalc;
    }

    public static void gameCalc(String userName) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            char[] operandArray = {'+', '-', '*'};
            char operator = operandArray[random.nextInt(operandArray.length)];
            System.out.println("Question: " + randomNumber + operator + randomNumber2);
            String userCalcAnswer = scanner2.next();
            System.out.print("Your answer: ");

            if ((operator == '+') && (randomNumber + randomNumber2 == Integer.parseInt(userCalcAnswer))) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if ((operator == '-') && (randomNumber - randomNumber2 == Integer.parseInt(userCalcAnswer))) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if ((operator == '*') && ((randomNumber * randomNumber2) == Integer.parseInt(userCalcAnswer))) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else if ((operator == '+') && (randomNumber + randomNumber2 != Integer.parseInt(userCalcAnswer))) {
                System.out.println("'" + userCalcAnswer + "' is wrong answer ;(. Correct answer was '" + (randomNumber + randomNumber2) + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            } else if ((operator == '-') && (randomNumber - randomNumber2 != Integer.parseInt(userCalcAnswer))) {
                System.out.println("'" + userCalcAnswer + "' is wrong answer ;(. Correct answer was '" + (randomNumber - randomNumber2) + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;

            } else if ((operator == '*') && (randomNumber * randomNumber2 != Integer.parseInt(userCalcAnswer))) {
                System.out.println("'" + userCalcAnswer + "' is wrong answer ;(. Correct answer was '" + (randomNumber * randomNumber2) + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;

            }
        }
    }
}
