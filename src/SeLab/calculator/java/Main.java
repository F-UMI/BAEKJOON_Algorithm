package SeLab.calculator.java;

import java.util.List;

public class Main {

  private static final int INIT_RANGE = 0;

  public static void main(String[] args) {

    Input input = new Input();
    Output output = new Output();
    Calculator calculator = new Calculator();
    List<String> expression = input.scanLine();
    Operator operator = new Operator(expression);
    Numbers numbers = new Numbers(expression);
    output.printResult(
        calculator.isProgressing(numbers.getNumbers(), operator.getOperator(), INIT_RANGE));
  }
}