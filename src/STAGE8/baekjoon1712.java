package STAGE8;

import java.util.Scanner;

/**
 * packageName : STAGE8
 * fileName : bj1_1712
 * author : Yunsup Shin
 * date : 2021-10-19
 * description : 손익 분기점 | https://www.acmicpc.net/problem/1712
 * 아마도 스레드 이용해야 할듯 0.35초를 지정할수 있는 방법이 그것밖에 생각이 안난다. (같은 문제가 생겻다.)
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-19 Yunsup Shin 최초 생성
 */

public class baekjoon1712 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fixedCost = scanner.nextInt();
        long productionCost = scanner.nextInt();
        long salePrice = scanner.nextInt();
        System.out.println(calculateBreakEvenPoint(fixedCost,productionCost,salePrice));

    }

    private static long calculateBreakEvenPoint(long fixedCost, long productionCost, long salePrice) {
        long i = 1;
        while (true) {
            i++;
            if (fixedCost + (productionCost)*i < salePrice * i) {
                return i;
            }
            if (i > 2100000000) {
                return -1;
            }
        }
    }
}
