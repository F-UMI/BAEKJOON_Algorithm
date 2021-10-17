package STAGE7;

import java.util.Scanner;

/**
 * fileName : baekjoon2_11720
 * date : 2021-10-17
 * description : 숫자의 합 |  https://www.acmicpc.net/problem/11720
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-17 CKIRUser 최초 생성
 */
public class baekjoon2_11720 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int answer = 0;
      String[] arr = new String[n];
      String s = scanner.next();
      arr = s.split("");
      for ( int i = 0; i < arr.length; i++ ) {
         answer += Integer.valueOf(arr[i]);
      }
      System.out.println(answer);
   }
}
