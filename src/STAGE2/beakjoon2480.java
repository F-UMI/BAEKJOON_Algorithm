package STAGE2;

import java.util.Scanner;

public class beakjoon2480 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] reward = new int[3];
    reward[0] = scanner.nextInt() * 100;
    reward[1] = scanner.nextInt() * 100;
    reward[2] = scanner.nextInt() * 100;
    System.out.println(calculateReward(reward));
  }

  private static int calculateReward(int[] reward) {
    if (reward[0] == reward[2] && reward[0] == reward[1]) {
      return tripleBonus(reward[0]);
    }
    else if (reward[0] == reward[2] || reward[0] == reward[1]){
      return doubleBonus(reward[0]);
    }
    else if (reward[1] == reward[2]) {
      return doubleBonus(reward[1]);
    }
    return Math.max(reward[2],Math.max(reward[0], reward[1]));


  }

  private static int tripleBonus(int reward) {
    return 10000 + (reward * 10);
  }

  private static int doubleBonus(int reward) {
    return 1000 + reward;
  }
}
