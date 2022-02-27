package STAGE5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class beakjoon3052 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList();
		for (int i = 0; i < 10; i++) {
			list.add(scanner.nextInt() % 42);
		}
		System.out.println(list.stream().distinct().count());
	}
}
