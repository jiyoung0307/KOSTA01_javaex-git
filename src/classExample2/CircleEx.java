package classExample2;
//생성자
//인스턴스나 클래스 변경하게 도아줌
public class CircleEx {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    Circle c2 = new Circle(10.0);
    Circle c3 = new Circle("Red");
    Circle c4 = new Circle(10.0,"Yellow" );

    System.out.println("c1.color = " + c1.color);
  }
}
