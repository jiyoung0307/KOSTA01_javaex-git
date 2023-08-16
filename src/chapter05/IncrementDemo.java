package chapter05;

public class IncrementDemo {
  public static void main(String[] args) {
    for (String arg: args) {
      System.out.println("args = " + arg);
    }
    int[] x = {0,1,2};
    System.out.println("호출 전의 x[0] = " + x[0]);

    increment(x);
    System.out.println("호출 후의 x[0] = " + x[0]);
  }

//  배열 자체가 넘어가는 것이 아니라 배열을 가르키는 참조 변수를 넘김 int[] n
  public static void increment(int[] n){
    System.out.println("Increment() 메서드 안에서 ");
    System.out.println("n[0] = " + n[0] + "--->");
    n[0]++;
    System.out.println("n[0] = " + n[0]);
  }
}
