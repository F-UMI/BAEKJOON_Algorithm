//5-3.숫자의 개수 | 21.10.12 // https://www.acmicpc.net/problem/2577
package STAGE5;

import java.util.Scanner;

public class baekjoon3_2577 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String total = Integer.toString(a * b * c);
		String[] totalSplit = total.split("");
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < totalSplit.length; i++) {
			for (int j = 0; j < arr.length ; j++) {
				if (Integer.valueOf(totalSplit[i]) == j) {
					arr[j]++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
