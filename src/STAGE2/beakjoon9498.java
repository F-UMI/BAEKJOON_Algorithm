//2-2.시험 성적 / https://www.acmicpc.net/problem/9498
package STAGE2;
import java.util.Scanner;

public class beakjoon9498 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80 && score <= 90) {
			System.out.println("B");
		}
		else if (score >= 70 && score <= 80) {
			System.out.println("C");
		}
		else if (score >= 60 && score <= 70) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}	
	

}
