package STAGE7;

import java.util.Scanner;

/**
 * fileName : baekjoon1_11654
 * date : 2021-10-17
 * description : 아스키 코드 | https://www.acmicpc.net/problem/11654
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-17 CKIRUser 최초 생성
 */
public class baekjoon1_11654 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String n = scanner.next();
      char answer = n.charAt(0);
      System.out.println((int)answer);
   }
}
