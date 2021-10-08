//3-4.빠른 A+B  /  https://www.acmicpc.net/problem/15552
package STAGE3;

import java.util.Scanner;

public class baekjoon4_15552 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int total = 0;
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);
	}
}