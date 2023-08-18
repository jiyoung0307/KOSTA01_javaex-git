package chapter07;

public class AbstractClassEx {
  public static void main(String[] args) {
// 객체 생성 (생성자)
    Circle c = new Circle();
    c.draw();

    Square s = new Square();
    s.draw();
  }
}

abstract class Shape {
  double pi = 3.14;
  abstract void draw();

  public double findArea(){
    return 0.0;
  }

}

// 상속받은 draw라는 메소드가 완전하지 않으므로 에러 발생 => Override로 해결
class Circle extends Shape {
//  Alt + Enter => Override
  @Override
  void draw() {
    System.out.println("원을 그리다.");
  }
}

class Square extends Shape {
//  Alt + Enter => Override
  @Override
  void draw() {

  }
}