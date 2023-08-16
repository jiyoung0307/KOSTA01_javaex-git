package chapter05;

import java.util.Arrays;

public class Array2Ex {
  public static void main(String[] args) {

    int[] array = {1,2,3,4,5};
    for (int num : array) {
      System.out.println(num);
    }
    System.out.println(array);    // tobe ==> [1,2,3,4,5]로 출력되지 않은 이유는 toString으로 오버라이딩을 하지 않아서임
    Arrays.toString(array);
    System.out.println("toString ==> " + (Arrays.toString(array)));   // toString ==> [1, 2, 3, 4, 5] 출력

//    문자를 원소를 갖는 carr을 만들고 초기값 a b c
    char[] carr = {'a','b','c'};
    String sArr = "abc";
    for (char c : carr) {
      System.out.println("c = " + c);
    }
      System.out.println(Arrays.toString(carr));
      System.out.println(sArr);
  }
}
