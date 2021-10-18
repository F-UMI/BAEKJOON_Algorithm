package STAGE7;

import java.util.Scanner;

/**
 * packageName : STAGE7
 * fileName : baekjoon9_2941
 * author : Yunsup Shin
 * date : 2021-10-18
 * description : 크로아티아 알파벳 | https://www.acmicpc.net/problem/2941
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2021-10-18 Yunsup Shin 최초 생성
 */
public class baekjoon9_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] croatiaAlphabetChange1 = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        for ( int i = 0; i < input.length(); i++ ) {
            for ( int j = 0; j < croatiaAlphabetChange1.length; j++ ) {
            }
//                if ( input.indexOf(croatiaAlphabetChange[j]) == i ) {
//                    count++;
//                    System.out.println("croatiaAlphabetChange[j] = " + croatiaAlphabetChange[j]);
//                    System.out.println("i = " + i);
//                    i = i + croatiaAlphabetChange[j].length();
//                    break;
//                }
//                else if ( input.substring(i, i + 1) != croatiaAlphabetChange[j] ) {
//                    count++;
//                    i++;
//                }

            }
        }


    }

