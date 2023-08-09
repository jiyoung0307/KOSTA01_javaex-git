package sample;

import java.util.Scanner;

public class InputOut {
  public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("숫자를 입력해주세요");

//        int i = scanner.nextInt();
//        System.out.println("i = " + i);

//        String s = scanner.nextLine();
//        int i2 = Integer.parseInt(s);
//        System.out.println("i2 = " + i2);

//        int a = 1_000_000;
//        int b = 2_000_000;
//        long c = a * (long)b;
//        System.out.println("c = " + c);

//        ArithmeticException 발생
    double res = 5/0.0; // Infinity
    double r = 5 % 0.0; // NaN

    boolean b1 = Double.isInfinite(res);
    boolean b2 = Double.isNaN(r);

    System.out.println("res = " + res);
    System.out.println("(r + 2) = " + (r + 2));

    System.out.println("b2 = " + b1);
    System.out.println("b2 = " + b2);

//        git 연동이 안되다,,, 왜지..
//        test
//        test2
  }
}