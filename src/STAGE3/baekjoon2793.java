//3-1.구구단  /  https://www.acmicpc.net/problem/2739
package STAGE3;

import java.util.Scanner;

public class baekjoon2793 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(n +" * " + i + " = " + n*i);
		}
	}
}
