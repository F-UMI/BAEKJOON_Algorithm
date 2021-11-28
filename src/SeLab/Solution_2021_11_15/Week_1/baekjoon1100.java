package SeLab.Solution_2021_11_15.Week_1;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1100 {
    public final static String[][] CHESSBOARD = new String[8][8];
    public final static int ZERO = 0;
    public final static String REGEX = "";
    public final static int TWO = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = ZERO;
        for (int i = 0; ; i++){
            CHESSBOARD[i] = divideTheSpace(scanner.next(), CHESSBOARD, i);
        }


    }

    public static String[] divideTheSpace(String col, String[][] CHESSBOARD, int i) {
        for (int j = 0; j < 8; j++){
            String[] str = col.split(REGEX);
            CHESSBOARD[i][j] = str[j];
        }
        return CHESSBOARD[i];
    }

    public static boolean onTheWhiteBoard(String[][] CHESSBOARD) {
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if((isOdd(i) && isOdd(j) || !isOdd(i) && !isOdd(j))) {
                    CHESSBOARD[i][j] = String.valueOf(1);
                }
            }
        }
        return true;
    }


    public static boolean isOdd(int num) {
        if(num % 2 == 0) return true;
        return false;
    }

    public static String isK(String piece ){
        if(piece.equals("K"));
        return "d";
    }
}