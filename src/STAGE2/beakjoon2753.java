//2-3.윤년 / https://www.acmicpc.net/problem/2753
package STAGE2;

import java.util.Scanner;

public class beakjoon2753 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int year = scanner.nextInt();
		int answer = 0;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			answer = 1;
			System.out.println(answer);
		} else {
			System.out.println(answer);
		}

	}

}
