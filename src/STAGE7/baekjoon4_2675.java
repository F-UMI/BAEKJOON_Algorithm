package STAGE7;

import java.util.Scanner;

/**
 * fileName : baekjoon4_2675
 * date : 2021-10-17
 * description : 문자열 반복 | https://www.acmicpc.net/problem/2675
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-17 CKIRUser 최초 생성
 * 2021-10-18 F-UMI 크기가 5인데  왜 출력 4문자 반복시 오류 x? ex) 3 /f = ///fff
 * */
public class baekjoon4_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String answer = "";
        int[] repeatNum = new int[n];
        String[] tmp = new String[n];
        for ( int i = 0; i < n; i++ ) {
            repeatNum[i] = scanner.nextInt();
            tmp[i] = scanner.next();
        }
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < repeatNum[i]; j++ ) {
                for ( int k = 0; k < repeatNum[i]; k++ ) {
                    try {
                        System.out.print(tmp[i].charAt(j));
                    } catch ( Exception e ) {
                        System.out.print(" .");
                    }
                }
            }
            System.out.println("");

        }
    }


}
