package SeLab.Solution_2021_11_15;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon11866 {
    final static int ZERO = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNumber = scanner.nextInt();
        int order = scanner.nextInt();
        scanner.close();
        int count = ZERO, nextOrder = order;
        int[] permutation = new int[peopleNumber];
        int[] josephusPermutation = new int[peopleNumber];
        for (int i : permutation){
            i = 1;
        }
        while (count != peopleNumber) {
            if(permutation[nextOrder] == 1) {
                josephusPermutation[count] = permutation[nextOrder];
                permutation[order] = 0;
                count++;
                nextOrder += order;
                if(nextOrder > order) nextOrder = nextOrder - order;
            }
            if(permutation[nextOrder] != 1) {
                nextOrder++;
                if(nextOrder > order) nextOrder = nextOrder - order;
            }
        }
        PrintResult(josephusPermutation);
    }

    public static void PrintResult(int[] josephusPermutation) {
        System.out.print("<");
        for (int i = 0; i < josephusPermutation.length; i++){
            System.out.print(josephusPermutation[i]);
            if(i == josephusPermutation.length-1) {
                System.out.println(">");
                break;
            }
            System.out.print(", ");;

        }
    }
}
