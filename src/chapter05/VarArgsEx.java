package chapter05;

public class VarArgsEx {
  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    printSum(1, 2, 3, 4, 5);
    printSum(10, 20, 30);
    printSum(numbers);
  }

  /* 가변 개수 인수 */
  static void printSum(int... number) {
//    static void printSum(int n1, int n2, int n3, int n4, int n5)
    int sum = 0;
    for (int num:number) {
      sum += num;
    }
    System.out.println("sum = " + sum);
  }

}
