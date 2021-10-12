//5-2.최댓값 | 21.10.12 // https://www.acmicpc.net/problem/2562
package STAGE5;

import java.util.Scanner;

public class baekjoon2_2562 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}

		int maxNumber = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (maxNumber < array[i]) {
				maxNumber = array[i];
				index = i+1;
			} else {
				continue;
			}
		}

		System.out.println(maxNumber);
		System.out.println(index);
	}
}
