//3-2.합  /  https://www.acmicpc.net/problem/8393
package STAGE3;

import java.util.Scanner;

public class baekjoon3_8393 {
	
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