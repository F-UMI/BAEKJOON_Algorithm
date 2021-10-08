//3-9.별 찍기 - 1  /  https://www.acmicpc.net/problem/2438
package STAGE3;

import java.util.Scanner;

public class baekjoon10_2439 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = a - 1; j <= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k >= a; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}