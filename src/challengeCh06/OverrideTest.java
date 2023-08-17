package challengeCh06;

public class OverrideTest {
  public static void main(String[] args) {
    Car c = new Car("파랑",200,1000,5);
    c.show();

    System.out.println();
//  메소드는 오버라이딩이 가능하다
    Vehicle v = c;
    // upCasting하지 않은 버전
//    Vehicle v = new Vehicle("파랑",200);
//  기능이 모두 출력되도록
    v.show();
  }
}

class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed){
    this.color = color;
    this.speed = speed;
  }

  public void show() {
    System.out.printf("%s 색깔의 최고속도: %d 인 탈것입니다.\n",color,speed);
  }
}

class Car extends Vehicle{
  int displacement;
  int gears;
  public Car(String color, int speed, int displacement, int gears){
    // 항상 맨 위로
    super(color, speed);
    this.displacement =  displacement;
    this.gears =  gears;
  }

  public void show() {
    System.out.printf("%s 색깔의 최고속도: %d 배기량 : %d 기어 : %d 인 자동차입니다.\n",color,speed, displacement, gears);
  }
}