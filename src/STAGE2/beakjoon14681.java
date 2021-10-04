//2-4.사분면 고르기 / https://www.acmicpc.net/problem/14681
package STAGE2;

import java.util.Scanner;

public class beakjoon14681 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int answer = 0;

		if (x > 0 && y > 0) {
			answer = 1;
		} else if (x < 0 && y > 0) {
			answer = 2;
		} else if (x < 0 && y < 0) {
			answer = 3;
		} else if (x > 0 && y < 0) {
			answer = 4;
		}
		System.out.println(answer);

	}

}
