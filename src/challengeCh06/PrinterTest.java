package challengeCh06;

// chap06 클래스
// p279 17
public class PrinterTest {
  public static void main(String[] args) {
//    Printer printer = new Printer();

//    객체를 생성하지 않고도 호출하는 방법
//    static 키워드를 작성
//    실행 클래스에서 대문자로 바꿔주기(대문자 - 클래스 참조 / 소문자 - 인스턴스 참조)
    Printer.println(10);
    Printer.println(true);

//    printer.println(5.7);
//    printer.println("홍길동");
  }
}
