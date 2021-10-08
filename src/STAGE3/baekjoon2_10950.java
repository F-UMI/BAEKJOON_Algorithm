//3-2.A+B -3  /  https://www.acmicpc.net/problem/10950
package STAGE3;

import java.util.Scanner;

public class baekjoon2_10950 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] ArrayA = new int[n];
		int[] ArrayB = new int[n];
		
		for (int i = 0; i < n; i++) {
			ArrayA[i] = scanner.nextInt();
			ArrayB[i] = scanner.nextInt();
			continue;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(ArrayA[i] + ArrayB[i]);
		}
		

	}
}