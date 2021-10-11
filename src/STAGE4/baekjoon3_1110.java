//4-3.더하기 사이클 21.10.11 // https://www.acmicpc.net/problem/1110
package STAGE4;

import java.util.Scanner;

public class baekjoon3_1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		int piece = 0, sum = 0, count = 0, loopN = n;
		
		while (true) {
			
			piece = loopN % 10;
			
			while (loopN != 0) {
				sum += loopN % 10;
				loopN /= 10;
			}
			
			if (sum >= 10) {
				sum = sum % 10;
			}
			
//			System.out.println("piece(10의자리) = " + piece + " |sum(1의 자리) =" + sum);
			loopN = piece * 10 + sum;
			sum = 0; //루프 반복할때마다 sum 값 초기화
//			System.out.println("loopN = " + loopN);
			count++;
			if (loopN == n) {
				System.out.println(count);
				break;
			}
		}
	}
}
