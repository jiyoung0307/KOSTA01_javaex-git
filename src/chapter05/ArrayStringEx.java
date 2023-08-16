package chapter05;

public class ArrayStringEx {
  public static void main(String[] args) {
//    선언 & 생성 (초기화X)
    String[] names = new String[3];
    for (String name: names) {
      System.out.println(name);
    }
    names[0] = "kim";
    names[1] = "lee";
    names[2] = "park";
    for (String name: names) {
      System.out.println("name : " + name);
    }
  }
}
