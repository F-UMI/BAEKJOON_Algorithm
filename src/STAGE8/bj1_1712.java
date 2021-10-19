package STAGE8;

import java.util.Scanner;

/**
 * packageName : STAGE8
 * fileName : bj1_1712
 * author : Yunsup Shin
 * date : 2021-10-19
 * description : 손익 분기점 | https://www.acmicpc.net/problem/1712
 * 아마도 스레드 이용해야 할듯 0.35초를 지정할수 있는 방법이 그것밖에 생각이 안난다.
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-19 Yunsup Shin 최초 생성
 */

public class bj1_1712 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fixedCost = scanner.nextInt();
        int varialbeCost = scanner.nextInt();
        int price = scanner.nextInt();
        int revenue = 0;
        long time = 0;
        start:
        while ( time < 350 ) {
            long startTime = System.currentTimeMillis();
            for ( int i = 0; fixedCost + (varialbeCost * i) < revenue; i++ ) {
                revenue = price * i;
                time = startTime - System.currentTimeMillis();
                if ( fixedCost + (varialbeCost * i) < revenue ) {
                    System.out.println(revenue);
                    break start;
                }
                else {
                    revenue = -1;
                }
            }

        }


    }
}
