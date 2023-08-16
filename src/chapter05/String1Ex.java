package chapter05;

public class String1Ex {
  public static void main(String[] args) {
//    ctrl + shift + Enter => 자동완성
    String s1 = new String("안녕,자바");
    String s2 = new String("안녕,자바");
    System.out.println("생성 후 : " + s1==s2);
    String s3 = "안녕,자바";
    String s4 = "안녕,자바";
//    s1 = "안녕,자바";         // 0x100
    System.out.println(s1);
//    String s2 = "안녕,자바";  // 0x100

    int i1 = 10;
    int i2 = 10;
    //이렇게 할당하면 true로 바뀜
    // 같은 것을 참조하기 떄문에 사용하지 않은 남은 하나는 JVM의 GC가 수거해감
    s1 = s2;
    System.out.println(i1==i2);           // true
    System.out.println("할당 후 : " + s1==s2);           // false
    System.out.println(s1.equals(s2));    // true (리터럴이 같으므로 true / 참조 타입을 equal로 비교하면 안되는 이유!)
    System.out.println(s3==s4);           // true
    System.out.println(s3.equals(s4));    // true
    System.out.println(s1);               // 안녕,자바 출력
  }
}
