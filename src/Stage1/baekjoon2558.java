//1-11.곱셈  /  https://www.acmicpc.net/problem/2558
//아직 못풀음
package Stage1;

import java.util.Scanner;

public class baekjoon2558 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		String b = scanner.next();
		String[] b_Array = b.split("");
		
		System.out.println(a * Integer.parseInt(b_Array[0]));
		System.out.println(a * Integer.parseInt(b_Array[1]));
		System.out.println(a * Integer.parseInt(b_Array[2]));
		System.out.println(a * Integer.valueOf(b));
		
	}

}