//package STAGE7;
//
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
///**
// * packageName : STAGE7
// * fileName : baekjoon8_5622
// * author : Yunsup Shin
// * date : 2021-10-18
// * description : 다이얼 |  https://www.acmicpc.net/problem/5622
// * ===========================================================
// * DATE AUTHOR NOTE
// * -----------------------------------------------------------
// * 2021-10-18 Yunsup Shin 최초 생성
// * BUFFER 사용 필요한듯 나중에 풀어야됨
// */
//public class baekjoon8_5622 {
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer stringTokenizer = null;
//
//        String dial = reader.readLine();
//        String[] dialCharacter = new String[dial.length()];
//        stringTokenizer = new StringTokenizer(reader.readLine());
//
//        for ( int i = 0; i < dial.length(); i++ ) {
//            dialCharacter[i] = stringTokenizer.nextToken();
//        }
//        int[] dialNumber = new int[dial.length()];
//        for ( int i = 0; i < dialCharacter.length; i++ ) {
//            switch ( dialCharacter[i] ) {
//                case "A", "B", "C" : dialNumber[i] = 1;
//                case "D", "E", "F" : dialNumber[i] = 1;
//                case "G", "H", "I" : dialNumber[i] = 1;
//                case "J", "K", "L" : dialNumber[i] = 1;
//                case "M", "N", "O" : dialNumber[i] = 1;
//                case "P", "Q", "R", "S" : dialNumber[i] = 1;
//                case "T", "U", "V" : dialNumber[i] = 1;
//                case "W", "X", "Y", "Z" : dialNumber[i] = 1;
//
//            }
//
//
//
//        }
//
//
//    }
//}
