//5-5.평균 | 21.10.12 // https://www.acmicpc.net/problem/1546
package STAGE5;

import java.util.Scanner;

public class baekjoon5_1546 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double[] arr = new double[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		double max = 0.0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		
		double total = 0.0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max *100;
			total += arr[i];
		}
		
		double answer = total / arr.length;
		System.out.println(answer);
		
	}
}
