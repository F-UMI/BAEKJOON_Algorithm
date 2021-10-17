package STAGE6;

/**
 * fileName : baekjoon1_15596
 * date : 2021-10-17
 * description : 정수 N개의 합 | https://www.acmicpc.net/problem/15596
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-17 CKIRUser 최초 생성
 */
public class baekjoon1_15596 {
    long sum(int[] a) {
        long sum = 0;

        for ( int i = 0; i < a.length; i++ ) {
            sum += a[i];
        }
        return sum;
    }
}