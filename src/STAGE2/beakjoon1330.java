//2-1.두 수 비교하기 / https://www.acmicpc.net/problem/1330
package STAGE2; 

import java.util.Scanner;

public class beakjoon1330 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a < b) {
			System.out.println("<");
		}
		if (a == b) {
			System.out.println("==");
		}
		if (a > b) {
			System.out.println(">");
		}
		
	}	
	
}
