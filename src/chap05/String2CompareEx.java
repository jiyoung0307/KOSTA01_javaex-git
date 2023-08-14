package chap05;

import classExample.Car;
public class String2CompareEx {
  public static void main(String[] args) {
    String s1 = "HI, JAVA";
    String s2 = "Hi, java";

    Car c1 = new Car();
    Car c2 = new Car();

//    hashCode과 equals를 오버라이딩해서 값이 같은지 확인해보자
    System.out.println(c1==c2);
    System.out.println(c1.equals(c2));

    System.out.println(s1.equals(s2));              // false
    System.out.println(s1.equalsIgnoreCase(s2));    // true
    System.out.println(s1.compareTo(s2));           //  -32
    System.out.println(s1.compareToIgnoreCase(s2)); // 0
  }
}
