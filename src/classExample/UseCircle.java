package classExample;

public class UseCircle {
  public static void main(String[] args) {
    Circle c = new Circle(20.0);
//    c.setRadius(20.0);
    System.out.println("c.getRadius() = " + c.getRadius());

    Circle c2 = new Circle(30.0);
//    c2.setRadius(30.0);
    System.out.println("c2.getRadius() = " + c2.getRadius());

//    기본 생성자가 없으므로 error 발생
    Circle c3 = new Circle();
    c3.setRadius(40.0);
  }
}
