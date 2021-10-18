package STAGE7;

/**
 * packageName : STAGE7
 * fileName : baekjoon6_1152
 * author : Yunsup Shin
 * date : 2021-10-18
 * description : 단어의 개수  | https://www.acmicpc.net/problem/1152
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-18 Yunsup Shin 최초 생성
 */
import java.util.Scanner;
public class baekjoon6_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.split(" ");
        int length = strings.length;
        for ( int i = 0; i < length; i++ ) {
            if ( strings[i].isEmpty()) {
                length = strings.length -1 ;
            }
        }
        System.out.println(length);

    }
}
