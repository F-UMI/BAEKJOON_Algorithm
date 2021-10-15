//5-6.OX퀴즈 | 21.10.15 // https://www.acmicpc.net/problem/8958
package STAGE5;

import java.util.Scanner;

public class baekjoon6_8958 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		String[] quiz = new String[size];
		
		for (int i = 0; i < quiz.length; i++) {
			quiz[i] = scanner.next();
		}
		int[] answer = new int[quiz.length];
		int	continous = 0;
		for (int i = 0; i < quiz.length; i++) {
			for (int j = 0; j < quiz[i].length(); j++) {
				if (quiz[i].charAt(j) == 'O') {
					answer[i] += 1 + continous;
					continous++;
				}
				if (quiz[i].charAt(j) == 'X') {
					continous = 0 ;
					continue;
				}
				if (j == quiz[i].length() -1) {
					continous = 0;
				}
			}
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
