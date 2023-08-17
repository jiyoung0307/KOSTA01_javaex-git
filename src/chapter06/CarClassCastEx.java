package chapter06;

public class CarClassCastEx {
  public static void main(String[] args) {
//  자동 업캐스팅
    Vehicle v = new Car();
    System.out.println(v.name);

//  오버라이드가 되면 오버라이드 된 것이 출력
//  필드 오버라이드 X / 메소드 오버라이드 O
    v.whoAmI();
    v.move();

    Vehicle v1 = new Vehicle();
    v1.whoAmI();

    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = v1;
//  업캐스팅 후 할당
    vehicles[1] = new Car();
    vehicles[2] = new SportsCar();

    for (Vehicle vehicle: vehicles) {
      vehicle.whoAmI();
    }
  }
}
