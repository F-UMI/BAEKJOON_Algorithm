//5-1.최소, 최대   | 21.10.12 // https://www.acmicpc.net/problem/10818
package STAGE5;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1_10818 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[n-1]);
		
	}
}
