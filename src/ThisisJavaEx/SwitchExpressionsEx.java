package ThisisJavaEx;

public class SwitchExpressionsEx {
  public static void main(String[] args) {
    /*
    * Expression 특징
    * - break문을 없애는 대신 화살표와 중괄호를 사용(가독성 높임)
    * - switche된 값을 변수에 바로 대입 가능
    * - 단일값의 경우
    *   - 화살표 오른쪽에 값을 기술
    * - 중괄호를 사용할 경우
    *   - yield 키워드로 값 저장
    *   - 단, 이 경우에는 default가 반드시 존재해야 함
    * */

    String grade = "B";

    int score = switch(grade) {
      case "A" -> 100;
      case "B" -> {
        int result = 100 - 20;
        yield result;
      }
      default -> 60;
    };

    System.out.println(score);
  }
}
