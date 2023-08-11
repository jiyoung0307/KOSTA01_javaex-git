package classExample2;
//ex) Triangle
//매개변수 10.0, 5.0
//메소드 findArea()

//필드
//생성자

public class Triangle {
  private double width;
  private double height;

//  단축키 Alt + Enter
  public Triangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

//  Getter
  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

//  Setter
  public void setWidth(double width) {
    if(width <= 0.0) {
      System.out.println("삼각형의 밑변의 값은 0.0보다 커야 합니다.");
      return;
    }
    this.width = width;
  }

  public void setHeight(double height) {
    if (height <= 0.0) {
      System.out.println("삼각형의 높이의 값은 0.0보다 커야 합니다.");
      return;
    }
    this.height = height;
  }

  public double findArea() {
    return width * height / 2;
  }


  public boolean isSameArea(Triangle t2) {
    return this.findArea() == t2.findArea();
  }
}
