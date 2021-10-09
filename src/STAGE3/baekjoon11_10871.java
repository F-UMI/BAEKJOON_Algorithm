//3-9.별 찍기 - 1  /  https://www.acmicpc.net/problem/2438
package STAGE3;

import java.util.Scanner;

public class baekjoon11_10871 {

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