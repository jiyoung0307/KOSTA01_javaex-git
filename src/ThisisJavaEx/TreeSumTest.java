package ThisisJavaEx;

public class TreeSumTest {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0) {    // 3,6,9,12 ...
        sum += i;
      }
    }
    System.out.println("3의 배수의 합은 : " + sum);
  }
}
