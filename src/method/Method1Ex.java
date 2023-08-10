package method;

public class Method1Ex {
  public static void main(String[] args) {
//    for(int j=0;j<3;j++) {
//      for (int i = 1; i <= 10; i++) {
//        sum += i;
//      }
//    }

      for(int j=0;j<1;j++) {
        System.out.printf("sum(1~10) = %d \n", sum(1,10L));
        System.out.printf("sum(10~100) = %d \n", sum(10,100L));
        System.out.printf("sum(100~1000) = %d \n", sum(1000_000_000,2000_000_000L));
      }

    }

    static long sum(long num1, long num2) {
//    void는 return값을 받지 않음 그래서 int로 바꿔주고 return 작성
      long sum = 0;
      for (long i=num1; i<=num2; i++) {
        sum += i;
      }
//      System.out.printf("\n sum(%d~%d) = %d \n", num1, num2, sum);
      return sum;
    }
}
