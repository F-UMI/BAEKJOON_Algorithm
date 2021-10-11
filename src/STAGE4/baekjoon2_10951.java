//4-1. A + B -4 // 21.10.11 // https://www.acmicpc.net/problem/10951
package STAGE4;

import java.util.Scanner;

public class baekjoon2_10951 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a + b);
		}

	}
}
 