package challengeCh06;

public class CircleTest {
  public static void main(String[] args) {
    Circle c = new ColoredCircle(10,"red");
    c.show();
    System.out.println("나오니?");

    ColoredCircle cc = new ColoredCircle(20,"white");
    cc.show();
  }
}

class Circle {
  int radius;

  public Circle(int radius, String color) {
    this.radius = radius;
  }

  public void show(){
    System.out.println("radius : " + radius);
  }
}

class ColoredCircle extends Circle {
  String color;
  public ColoredCircle(int radius, String color){
    super(radius, color);
    this.color = color;
  }

  public void show() {
    System.out.println("color : " + color);
  }
}
