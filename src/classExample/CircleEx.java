package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.0);
    System.out.println("crcle.radius = " + circle.getRadius());
//    System.out.println("circle = " + circle);   //circle = classExample.Circle@6d311334 출력(주소 출력)
  }
}

  class Circle {
    private double radius = 0.0;
//    단축키 alt + insert
//    Constructor
    public Circle() {
    }
    //    getter
    public Circle(double radius) {
      this.radius = radius;
    }

    public double getRadius() {
      return radius;
    }

    public void setRadius(double radius) {
      this.radius = radius;
    }
  }

