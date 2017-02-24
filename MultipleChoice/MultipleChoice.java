//This program asks three multiple choice questions and returns the number of correct and wrong answers.

import java.util.Scanner;

public class MultipleChoice {

    public static void main(String args[]) {
        int correctAnswer = 0;
        int wrongAnswer = 0;
        int q1, q2, q3;
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MY FOOTBALL QUIZ. PICK ONLY ONE OUT OF THE FOUR OPTIONS");
        System.out.println("QUESTION ONE: \n WHICH NATION WON THE JUST CONCLUDED AFRICAN CUP OF NATIONS? \n"
                + "1.GHANA 2.EGYPT 3.CAMEROON 4.UGANDA");
        q1 = input.nextInt();
        switch (q1) {
            case 1:
                System.out.println("GHANA");
                break;
            case 2:
                System.out.println("EGYPT");
                break;
            case 3:
                System.out.println("CAMEROON");
                break;
            case 4:
                System.out.println("UGANDA");
                break;
            default:
                System.out.println("PICK A VALID OPTION");
        }
        if (q1 == 3) {
            correctAnswer++;
        } else {
            wrongAnswer++;
        }

        System.out.println("QUESTION TWO: \n WHICH OF THESE NATIONS DID NOT QUALIFY FOR THE JUST CONCLUDED AFRICAN CUP OF NATIONS? \n"
                + "1.GHANA 2.NIGERIA 3.CAMEROON 4.UGANDA");
        q2 = input.nextInt();
        switch (q2) {
            case 1:
                System.out.println("GHANA");
                break;
            case 2:
                System.out.println("NIGERIA");
                break;
            case 3:
                System.out.println("CAMEROON");
                break;
            case 4:
                System.out.println("UGANDA");
                break;
            default:
                System.out.println("PICK A VALID OPTION");
        }
        if (q2 == 2) {
            correctAnswer++;
        } else {
            wrongAnswer++;
        }

        System.out.println("QUESTION THREE: \n WHICH NATION WON THE 2004 EDITION OF THE UEFA EURO NATIONS CUP? \n"
                + "1.GREECE 2.PORTUGAL 3.SPAIN 4.CZECH");
        q3 = input.nextInt();
        switch (q3) {
            case 1:
                System.out.println("GREECE");
                break;
            case 2:
                System.out.println("PORTUGAL");
                break;
            case 3:
                System.out.println("SPAIN");
                break;
            case 4:
                System.out.println("CZECH");
                break;
            default:
                System.out.println("PICK A VALID OPTION");
        }
        if (q3 == 1) {
            correctAnswer++;
        } else {
            wrongAnswer++;
        }

        System.out.println("Number of correct anwsers:" + correctAnswer);
        System.out.println("Number of wrong anwsers:" + wrongAnswer);
        if (correctAnswer >= 2) {
            System.out.println("Excellent!");
        } else {
            System.out.println("I'll suggest you start watching some football son!");
        }
    }
}
