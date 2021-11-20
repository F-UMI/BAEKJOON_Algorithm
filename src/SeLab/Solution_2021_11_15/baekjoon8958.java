package SeLab.Solution_2021_11_15;

import java.util.Scanner;

public class baekjoon8958 {
    public static void main(String[] args) {

        //구현에 필요한 변수 선언
        Scanner scanner = new Scanner(System.in);
        int testCaseNum = scanner.nextInt();
        int[] testCaseResult = new int[testCaseNum];
        int testCaseTotalScore = 0;

        //테스트 케이스별 문자열을 통한 점수 계산 반복문
        for (int i = 0; i < testCaseNum; i++){
            String[] TestCase = scanner.next().split("");
            int score = 0;
            for (String answer : TestCase){
                if(answer.equals("O")) {
                    score++;
                    testCaseTotalScore += score;
                } else {
                    score = 0;
                }
            }
            testCaseResult[i] = testCaseTotalScore;
            testCaseTotalScore = 0;
        }

        //계산된 결과 출력
        for (int result : testCaseResult){
            System.out.println(result);
        }

    }
}
