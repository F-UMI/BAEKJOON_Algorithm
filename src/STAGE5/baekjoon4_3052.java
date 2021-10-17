//5-4.나머지 | 21.10.17 // https://www.acmicpc.net/problem/3052
// hash 이용 하는듯, 나중에 해야할듯
package STAGE5;

import java.util.Scanner;

public class baekjoon4_3052 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		int[] reminder = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i ++) {
			arr[i] = scanner.nextInt() % 42;
		}

		for ( int i = 0; i < arr.length; i++ ) {
			for ( int j = i+1; j < arr.length; j++ ) {
				if ( arr[i] == arr[j] )	{
					count++;
				}
			}
		}
		System.out.println(10 - count);
	}
}
