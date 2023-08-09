package sample;

/**
 * Hello world sample class
 * main method
 * hello 츨력하는 프로그램
 */
public class Hello {
  public static void main(String[] args) {
    char three = 3 + '0';
    int i = '3' - '0';
    String str3 = 3.0 + "";
    double d3 = Double.parseDouble(str3);

    double result = d3 + 10;
    char c = "30".charAt(1);
    System.out.println(c);

    double res = (double)7/4;
    System.out.println(res);
    System.out.printf("i = %d and double d3 = %.1f \n", i, d3);


//        final double PI = 3.14159;
//        PI = 3.14;?

//        var num = 100;
//        var name = "hello hello";

//        long i = 3_100_000_000L;

//        double d = (double)3.14f;
//
//        byte b = (byte)300;
//        System.out.println(b);

//        float f = (float)3.14;
//        System.out.println(f);

//        자바 10부터 var는 예약어이므로 제대로 작성하지 않으면 에러 발생
//        error 발생
//        var oops;

//        String hello = "안녕 !";
//        System.out.println("hello");
//        System.out.println(hello);


  }
}
