package classExample;

public class LocalVarEx {
  public static void main(String[] args) {
//    지역 변수는 기본값이 없으므로 무조건 초기화해줄 것!
    int a = 2;
    double b = 0.0;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    for(int i=0; i < 2; i++) {
      int c = 1;
      System.out.println("c = " + c);
//      System.out.println(a);
    }
    System.out.println("a = " + a);
  }
}
