//2-5.알람 시계 / https://www.acmicpc.net/problem/2884
package STAGE2;

import java.util.Scanner;

public class beakjoon2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int hour = scanner.nextInt();
		int minute = scanner.nextInt();

		if (minute >= 45 && minute <= 60) {
			minute = minute - 45;
		}
		else if (minute >= 0 && minute < 45) {
			minute = 60 + (minute - 45);
			if (hour == 0) {
				hour = 23;
			} else {
				hour = hour - 1;
			}
		}
		System.out.print(hour+" "+minute);
	}

}