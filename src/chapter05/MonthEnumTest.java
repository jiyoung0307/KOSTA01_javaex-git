package chapter05;

import challengeCh05.Month;

public class MonthEnumTest {
  public static void main(String[] args) {
    Month month = Month.APR;

    System.out.println(month.name());
    System.out.println(month.ordinal());    // 순서
    System.out.println(month.getMonth());   // 값
  }
}
