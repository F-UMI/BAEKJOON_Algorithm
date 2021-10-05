//3-2.A+B -3  /  https://www.acmicpc.net/problem/10950
package STAGE3;

import java.util.Scanner;

public class baekjoon10950 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int[] array = new int[i];
		
		for (int j = 0; j < i; j++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			array[i] = a + b;
	
		}
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[i]);
		}
	}
}
