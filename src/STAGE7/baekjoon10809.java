package STAGE7;

import java.util.Scanner;

public class baekjoon10809 {
  final static int NUMBER_OF_ALPHABETS = 26;


  public static void main(String[] args) {
    int[] alphabet = new int[NUMBER_OF_ALPHABETS];
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    for (int i = 0; i < NUMBER_OF_ALPHABETS; i++) {
      alphabet[i] = findIndexOfAlphabet(s);
    }
  }


  private static int findIndexOfAlphabet(String s) {
    for (char d = 97; d < 97 + NUMBER_OF_ALPHABETS; d++) {
      if (s.contains(d))
    }
  }
  97 -122
}
