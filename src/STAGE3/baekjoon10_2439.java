//3-10.별 찍기 - 2  /  https://www.acmicpc.net/problem/2439
package STAGE3;

import java.util.Scanner;

public class baekjoon10_2439 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}