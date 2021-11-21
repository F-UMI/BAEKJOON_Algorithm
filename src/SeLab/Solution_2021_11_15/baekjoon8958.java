package SeLab.Solution_2021_11_15;

import java.util.Scanner;

public class baekjoon8958 {
    public static final int ZERO = 0;
    public static final String REGEX = "";
    public static final String CORRECT = "O";
    public static final String WRONG = "X";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCaseNum = scanner.nextInt();
        int[] testCaseResult = new int[testCaseNum];
        for (int i = 0; i < testCaseNum; i++){
            String[] TestCase = scanner.next().split(REGEX);
            testCaseResult[i] = gradeTestCase(TestCase, ZERO, ZERO);
        }
        scanner.close();

        for (int result : testCaseResult){
            System.out.println(result);
        }
    }

    public static int gradeTestCase(String[] TestCase, int score, int testCaseTotalScore) {
        for (String answer : TestCase){
            testCaseTotalScore =
                    answer.equals(CORRECT) ? isCorrect(score , testCaseTotalScore) : isWrong(score);
        }
        return testCaseTotalScore;
    }

    public static int isCorrect(int score, int testCaseTotalScore) {
        score++;
        return testCaseTotalScore += score;
    }

    public static int isWrong(int score) {
        return score = 0;
    }


}
