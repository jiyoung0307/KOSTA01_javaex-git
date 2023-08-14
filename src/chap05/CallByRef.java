package chap05;

import classExample.Circle;

public class CallByRef {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    Circle c2 = new Circle(10.0);

    zero(c1);
    System.out.println("메소드 실행 후 반지름 (c1.getRadius) = " + c1.getRadius());
    zero(c2.getRadius());
    System.out.println("메소드 실행 후 반지름 (c2.getRadius) = " + c2.getRadius());;
  }

  public static void zero(Circle c){
//    캡슐화되어 있어서 set
    c.setRadius(1.0);
  }

  public static void zero(double r){
//  지역변수
//  값은 변하지 않음, 단지 read만 할뿐
    r=1.0;
  }
}
