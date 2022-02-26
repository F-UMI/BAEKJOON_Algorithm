package STAGE2;

import java.util.Scanner;

public class beakjoon2525 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour = scanner.nextInt();
    int minute = scanner.nextInt();

    int cookingTime = scanner.nextInt();
    int[] answer = calculatingTime(hour,minute,cookingTime);
    System.out.println(answer[0] + " " + answer[1]);
  }

  private static int[] calculatingTime(int hour, int minute, int cookingTime) {
    minute += cookingTime % 60;
    if (minute >= 60) {
      hour++;
      minute = minute - 60;
    }
    hour += cookingTime / 60;
    if (hour >= 24) {
      hour = hour - 24;
    }
    return new int[]{hour, minute};
  }
}
