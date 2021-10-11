//4-1. A + B - 5 // 21.10.11 // https://www.acmicpc.net/problem/10952
package STAGE4;

import java.util.Scanner;

public class baekjoon1_10952 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0) {
				run = false;
				break;
			}
			System.out.println(a + b);
			

		}
	}

}
