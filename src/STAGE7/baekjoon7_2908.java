package STAGE7;

/**
 * packageName : STAGE7
 * fileName : baekjoon7_2908
 * author : Yunsup Shin
 * date : 2021-10-18
 * description : 상수 | https://www.acmicpc.net/problem/2908
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-18 Yunsup Shin 최초 생성
 */
import java.util.Scanner;
public class baekjoon7_2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String[] stringA = String.valueOf(a).split("");
        String[] stringB = String.valueOf(b).split("");
        String tmpA = "";
        String tmpB = "";
        tmpA = stringA[0];
        stringA[0] = stringA[stringA.length - 1];
        stringA[stringA.length - 1] = tmpA;
        tmpB = stringB[0];
        stringB[0] = stringB[stringB.length - 1];
        stringB[stringB.length - 1] = tmpB;
        a = Integer.parseInt(String.join("", stringA));
        b = Integer.parseInt(String.join("", stringB));
        System.out.println(Math.max(a, b));
    }
}
