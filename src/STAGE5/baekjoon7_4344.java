//5-7.평균은 넘겠지 | 21.10.16 // https://www.acmicpc.net/problem/4344
package STAGE5;

import java.util.Scanner;

public class baekjoon7_4344 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double[] testCase = new double[num];
        int count = 0;

        for (int i = 0; i < testCase.length; i++) {
            int StudentNum = scanner.nextInt();
            int[] score = new int[StudentNum];
            for (int j = 0; j < StudentNum; j++) {
                score[j] = scanner.nextInt();
            }

            int avg = 0, sum = 0;
            for (int k = 0; k < score.length; k++) {
                sum += score[k];
            }

            avg = sum / score.length;
            for (int l = 0; l < score.length; l++) {
                if (score[l] > avg) {
                    count++;
                }
            }

            testCase[i] = ((double) count / StudentNum) * 100;
            count = 0;
            continue;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(String.format("%.3f", testCase[i]) + "%");
        }
    }
}
