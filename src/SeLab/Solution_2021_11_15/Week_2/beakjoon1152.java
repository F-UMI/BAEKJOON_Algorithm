package SeLab.Solution_2021_11_15.Week_2;

import java.util.Scanner;

/* 백준 1152번
*
* */
public class beakjoon1152 {

  public final static String REGEX = " ";
  public final static int INIT_RANGE = 0;
  public final static int REMOVE_SPACES = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] string = (scanner.nextLine()).split(REGEX);
    System.out.println(countWord(string, INIT_RANGE));
  }

  public static int countWord(String[] string, int numberOfCharacters) {
    for (int i = 0; i < string.length; i++) {
      if (string[i].isEmpty()) {
        numberOfCharacters = string.length - REMOVE_SPACES;
      }
    }
    return numberOfCharacters;
  }

}
