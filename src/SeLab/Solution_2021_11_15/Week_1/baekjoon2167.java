package SeLab.Solution_2021_11_15.Week_1;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class baekjoon2167 {
    public static final int INIT_RANGE = 0;
    public static final int GAP = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        scanArray(array, scanner);
        int testCase = scanner.nextInt();
        int[] testCaseResult = new int[testCase];
        for (int k = 0; k < testCase; k++){
            testCaseResult[k] = getSum(array, scanner, INIT_RANGE);
        }
        scanner.close();
        System.out.println();
        printResult(testCaseResult);
    }

    private static void scanArray(int[][] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static int getSum(int[][] array, Scanner scanner, int total) {
        int i = scanNumber(scanner);
        int j = scanNumber(scanner);
        int x = scanNumber(scanner);
        int y = scanNumber(scanner);
        for (int k = i - 1; k < j - 1; k++){
            for (int l = x - 1; l < y - 1; l++){
                total += array[i][j];
            }
        }
        return total;
    }

    public static int scanNumber(Scanner scanner) {
        return scanner.nextInt() - GAP;
    }

    public static void printResult(int[] testCaseResult) {
        for (int result : testCaseResult){
            System.out.println(result);
        }
    }

}

