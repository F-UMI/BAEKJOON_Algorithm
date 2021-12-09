package SeLab.calculator.java;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Operator {

  private final List<String> operator = new ArrayList<>();


  public Operator(List<String> inputs) {
    for (String input : inputs) {
      if (matchOperator(input)) {
        setOperator(input);
      }
    }
  }

  public List<String> getOperator() {
    return operator;
  }

  public void setOperator(String input) {
    operator.add(input);
  }

  public static boolean matchOperator(String input) {
    return input.matches("[\\+\\-\\*\\/]");
  }
}
