package STAGE7;

import java.util.Scanner;

/**
 * fileName : baekjoon3_10809
 * date : 2021-10-17
 * description : 알파벳 찾기 | https://www.acmicpc.net/problem/10809
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-17 CKIRUser 최초 생성
 *
 */
public class baekjoon3_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String[] split = s.split("");
        char[] alphabet = new char[26];
        int[] alphabetInts = new int[26];
        for ( int i = 0; i < alphabet.length; i++ ) {
            alphabet[i] = (char) (97 + i);
            System.out.println(alphabet[i]);
        }

        for ( int i = 0; i < split.length; i++ ) {
            for ( int j = 0; j < alphabet.length; j++ ) {
                if ( split[i] == Character.toString(alphabet[j]) ) {
                   alphabetInts[j] = i;
                } else {
                   alphabetInts[j] = -1;
                }

            }
        }
        for ( int i = 0; i < alphabetInts.length; i++ ) {
            System.out.print(alphabetInts[i] + " ");
        }
    }
}
