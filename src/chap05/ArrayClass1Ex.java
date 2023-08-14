package chap05;

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
  }
}
