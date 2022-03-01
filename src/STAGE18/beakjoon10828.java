package STAGE18;

import java.util.Scanner;
import java.util.Stack;

public class beakjoon10828 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < testCase; i++) {
      System.out.println(scanCommand(scanner.next(), stack));
    }
  }

  private static int scanCommand(String next, Stack<Integer> stack) {
    if (next.substring(0, 4).equals("push")) {
      stackPUSH(stack, next);
    }
    switch (next) {
      case "pop":
        return stackPOP(stack);
      case "size":
        return stackSIZE(stack);
      case "empty":
        return stackEMPTY(stack);
      case "top":
        return stackTOP(stack);
    }
    throw new RuntimeException("조건이 잘못 됬거나 무언가 맞지 않습니다.");
  }

  private static int stackPOP(Stack<Integer> stack) {
    if (stack.empty()) {
      return -1;
    }
    return stack.pop();
  }

  private static int stackSIZE(Stack<Integer> stack) {
    return stack.size();
  }

  private static int stackEMPTY(Stack<Integer> stack) {
    if (stack.empty()) {
      return 1;
    } else {
      return 0;
    }
  }

  private static int stackTOP(Stack<Integer> stack) {
    if (stack.empty()) {
      return -1;
    }
    return stack.peek();
  }

  private static void stackPUSH(Stack<Integer> stack, String next) {
    String[] tmp = next.split(" ");
    stack.push(Integer.parseInt(tmp[1]));
  }

}
