package classExample2;

public class Singleton {
  private static Singleton singleton = new Singleton();
  /*
   * singleton 패턴
   * - 애플리케이션 전체에서 단 한개의 객체만 생성해서 사용하려고 할 때 사용
   */
  private Singleton() {
  }

  static Singleton getInstance() {
    return singleton;
  }
}
