//1-11.곱셈  /  https://www.acmicpc.net/problem/2558
package Stage1;

import java.util.Scanner;

public class baekjoon2558 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.nextLine();

		String b = scanner.nextLine();
		String[] b_Array = b.split("");

		System.out.println(Integer.valueOf(a) * Integer.parseInt(b_Array[2]));
		System.out.println(Integer.valueOf(a) * Integer.parseInt(b_Array[1]));
		System.out.println(Integer.valueOf(a) * Integer.parseInt(b_Array[0]));
		System.out.println(Integer.valueOf(a) * Integer.valueOf(b));

	}

}