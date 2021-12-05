import java.util.*;

public class Calculator {

  private final static int FRONT_NUMBER = 0;
  private final static int OPERATOR_INDEX = 1;
  private final static int BEHIND_NUMBER = 2;

  protected int isProgressing(List<Integer> numbers, List<String> operator, int answer) {
    for (int i = 0; i < operator.size(); i++) {
      for (int j = 0; j < numbers.size() / 2; j++) {
        answer += Operators.calculating(getIndexNumber(j, numbers),
            getIndexOperator(i, operator),
            getIndexNumber(j + 1, numbers));
      }
    }
    return answer;
  }

  private static int getIndexNumber(int index, List<Integer> numbers) {
    return numbers.get(index);
  }

  private static String getIndexOperator(int index, List<String> operator) {
    return operator.get(index);
  }
}
/*    while (true) {

      String operator = inputs.get(OPERATOR_INDEX);
      int frontNumber = Integer.parseInt(inputs.get(FRONT_NUMBER));
      int behindNumber = Integer.parseInt(inputs.get(BEHIND_NUMBER));
      answer = Operators.calculating(frontNumber, operator, behindNumber);

      removeUsedIndex(inputs);

      if (inputs.isEmpty()) {
        break;
      }

      addUpResult(inputs, String.valueOf(answer));
    }
    return answer;*/


/*

  private void removeUsedIndex(List<String> inputs) {
    for (int i = 0; i < 3; i++) {
      inputs.remove(FRONT_NUMBER);
    }
  }

  private void addUpResult(List<String> inputs, String result) {
    inputs.add(FRONT_NUMBER, String.valueOf(result));
  }
}
*/


