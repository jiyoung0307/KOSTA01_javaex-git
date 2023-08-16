package chapter05;

import classExample.Circle;

public class ArrayClass1Ex {
  public static void main(String[] args) {
    // findArea 가 있는 Circle을 원소로 가지는 배열 , 배열의 크기는 5
    // circle의 radius를 다르게 초기화(1,2,3,4,5)
    // 5개의 원의 넓이를 출력

    Circle[] circles = new Circle[5];
    for (int i=0; i < circles.length; i++) {
      circles[i] = new Circle((double)i+1);
    }

    int i=0;
    for (Circle circle : circles) {
      System.out.printf("원[%d]의 넓이 = %.2f\n",i++, circle.findArea());
//      i++;
    }
    for (Circle circle: circles) {
      System.out.println("반지름 변경 메소드 실행 전 : " + circle.getRadius());
      change(circle);
      System.out.println("반지름 변경 메소드 실행 후 : " + circle.getRadius() + "\n");
    }
  }

  // 원의 반지름을 1씩 증가시키는 change함수 생성
  // 함수가 실행된 이후에 원의 반지름이 1씩 증가할 수 있도록 참조변수를 매개변수로 하는 메소드 만드시오.

  public static void change(Circle c) {
//    참조변수를 가져왔으므로 read, write 모두 가능
    c.setRadius(c.getRadius() + 1);
  }

}
