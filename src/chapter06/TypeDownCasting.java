package chapter06;

public class TypeDownCasting {
  public static void main(String[] args) {
//  ClassCastException error 발생
//    Student s = (Student) new Person();
//    s.whoAmI();
//    s.work();
    Student s = new Student();
    Person p = new Person();
    Worker w = new Worker();

    System.out.println("s instanceof Student ==> " + (s instanceof Student));
    System.out.println("s instanceof Person ==> " + (s instanceof Person));
    System.out.println("p instanceof Student ==> " + (p instanceof Student));
    System.out.println("p instanceof Object ==> " + (p instanceof Object));
//    System.out.println("s instanceof String : " + (s instanceof String));

    downcast(p);
    downcast(s);
    downcast(w);
//  downcast("hello");
//  downcast(new Object());
    downcast(new Person());
  }

  // 하나의 Method로 처리해보자
  // 반드시 범위가 작은거부터 작성할 것
  static void downcast(Person p) {
    p.whoAmI();
//    ClassCastException를 방지
    if (p instanceof Student) {
      Student s = (Student) p;
      s.work();
//      s.whoAmI();
    } else if (p instanceof Worker) {
//      (Worker) w = (Worker) p;
//      w.work();
    } else {
      p.whoAmI();
    }
  }

//  static void downcast(Student s) {}
//  static void downcast(Worker w) {}
}
