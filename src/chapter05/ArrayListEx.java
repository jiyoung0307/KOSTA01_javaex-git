package chapter05;

import java.util.ArrayList;

public class ArrayListEx {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.println("numbers = " + numbers);

    /* [10, 9, 8] 순서로 뒤로 가기 떄문에 DoubleLinkedList */

    numbers.add(10);
    System.out.println("numbers 10 추가 후  = " + numbers);   // numbers 10 추가 후  = [10]

    numbers.add(9);
    System.out.println("numbers 9 추가 후  = " + numbers);   // numbers 9 추가 후  = [10, 9]

    numbers.add(8);
    System.out.println("numbers 8 추가 후  = " + numbers);   // numbers 8 추가 후  = [10, 9, 8]

    /* 11이 앞에 들어오기 때문에 SingleLinkedList */
    numbers.add(0,11);
    System.out.println("numbers.add(0,11) = " + numbers);
    System.out.println("numbers.size() = " + numbers.size());

    numbers.remove(1);
    System.out.println("numbers.remove(1) = " + numbers);

    numbers.get(2);
    System.out.println("numbers.get(2) = " + numbers.get(2));
  }
}
