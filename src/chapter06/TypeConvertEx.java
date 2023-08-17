package chapter06;

public class TypeConvertEx {
  public static void main(String[] args) {
//    Person p = new Person();
//    Student s = new Student();
//
//    String name = s.name;
//    int number = s.number;
//    s.work();
//    s.whoAmI();
//
//    name = p.name;
//    p.whoAmI();

    /* 자동형변환 예제 */
    Person p;
    Student s = new Student();
    p = s;

    Worker w = new Worker();

    String name = p.name;
    p.whoAmI();

//  자동형변환
//  사용 이유?
//  - 매소드의 매개변수를 넘길 때 자동형 변환 후 넘기면 매우 편리

//  worker를 가르키기는 하지만 worker의 기능 사용은 불가능
    p = w;
    p.whoAmI();

//  같은 자식끼리는 형변환이 불가능하다.
    String s1;
//    s1 = w;

//  Object은 모두 형변환 가능
//  매개변수로 넘기기 위한 준비만 가능
////  자손의 기능 사용 X
//    Object o;
//    o = s;
//    o = p;
//    o = w;

    Object o = new Person();
//    o = s;
//    o = p;
//    다형성 덕분에 가능
    Person p1 = new Student();
    Person p2 = new Worker();
  }
}
