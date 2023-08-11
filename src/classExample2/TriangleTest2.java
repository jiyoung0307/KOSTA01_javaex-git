package classExample2;

public class TriangleTest2 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10.0, 5.0);
    System.out.println("t.넓이 = " + t1.findArea());

    Triangle t2 = new Triangle(5.0, 10.0);
    System.out.println("t2.넓이 = " + t2.findArea());

    Triangle t3 = new Triangle(8.0,8.0);
    System.out.println("t3.넓이 = " + t3.findArea());

    System.out.println(t1.isSameArea(t2));
    System.out.println(t1.isSameArea(t3));

  }
}
