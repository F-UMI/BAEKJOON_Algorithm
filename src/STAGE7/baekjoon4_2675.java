package STAGE7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * fileName : baekjoon4_2675 date : 2021-10-17 description : 문자열 반복 |
 * https://www.acmicpc.net/problem/2675 ===========================================================
 * DATE AUTHOR NOTE ----------------------------------------------------------- 2021-10-17 CKIRUser
 * 최초 생성 2021-10-18 F-UMI 크기가 5인데  왜 출력 4문자 반복시 오류 x? ex) 3 /f = ///fff
 */
public class baekjoon4_2675 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        List<String> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            System.out.println(stringCreation(scanner.nextInt(), scanner.next()));
        }

    }

    private static String stringCreation(int nextInt, String next) {
        String[] tmp = next.split("");
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] += characterRepetition(nextInt, tmp[i]);
        }
        return String.join("", tmp);
    }

    private static String characterRepetition(int nextInt, String next) {
        for (int i = 0; i < nextInt; i++) {
            next += next;
        }
        return next;
    }
}


