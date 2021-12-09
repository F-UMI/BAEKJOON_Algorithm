package SeLab.calculator.java;

import java.util.*;
import java.util.regex.Pattern;

public class Numbers {

  public List<Integer> numbers;

  public Numbers(List<String> inputs) {
    for (String input : inputs) {
      if (matchNumber(input)) {
        setNumber(input);
      }
    }
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumber(String number) {
    numbers.add(mapInto_Int(number));
  }


  private int mapInto_Int(String number) {
    return Integer.parseInt(number);
  }

  public static boolean matchNumber(String input) {
    return Pattern.matches(input, "[0-9]");
  }
}
