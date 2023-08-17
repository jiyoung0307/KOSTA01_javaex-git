package chapter07;

public class AbstractMethodEx {
  public static void main(String[] args) {
//    AbstractClass abstractClass = new AbstractClass();
  }
}

abstract class Database {
  double PI = 3.14;

  abstract void use();

  abstract double getPI();
}

//중간에 추가를 하게 되면 기존에 만들 애들이 에러 발생
class MySQL extends Database {
  @Override
  void use() {
    System.out.println("MySQL을 사용합니다.");
  }

  @Override

  double getPI() {
    return 0;
  }
}

class Orcle extends Database {
  @Override
  void use() {

  }

  @Override
  double getPI() {
    return 1;
  }
}