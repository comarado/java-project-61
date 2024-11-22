package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Progression {
    /*public static String userName;
    public static String gameEven;

    Even() {
        this.userName = userName;
        this.gameEven = gameEven;
    }*/

    public static void gameProgression(String userName) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        for (int n = 0; n < 3; n++) {
            int randomNumberInArray = random.nextInt(9);
            int randomStep = random.nextInt(10);
            int randomFirstElement = random.nextInt(10);
            int[] array = new int[10];
            int m;
            //array[0] = randomFirstElement;
            System.out.print("Question: ");

            for (int i = 0; i < array.length; i++) {
                if (i == 0) array[0] = randomFirstElement;
                else array[i] = array[i - 1] + randomStep;

                if (i != randomNumberInArray && i != array.length - 1) System.out.print(array[i] + " ");
                else if (i == randomNumberInArray) {
                    System.out.print(".. ");
                }
                else if (i == array.length-1) System.out.println(array[i]);
            }


            System.out.print("Your answer: ");
           String userProgressionAnswer = scanner2.next();

            m = array[randomNumberInArray];

            if (Integer.parseInt(userProgressionAnswer) == m) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + userName + "!");
                }
            else {
            System.out.println("'" + userProgressionAnswer + "' is wrong answer ;(. Correct answer was '" + m + "'.");
            System.out.println("Let's try again, " + userName + "!");
            break;
        }
        }
        //String arrayString = Arrays.toString(array[]);




        /*for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(9);
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
                break;*/

            }
        }



