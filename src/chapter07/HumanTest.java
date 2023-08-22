package chapter07;

public class HumanTest {
  public static void main(String[] args) {
    Human.echo();              // static으로 만들어라
    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new Worker();   // 책에는 Person p = new Person();이라고 나와있는데
    p.print();                // 오타라고 생각해 문제에 맞게끔 임의로 수정했다.
    p.eat();
  }
}

interface Human {
  void eat();

  default void print() {
    System.out.println("인간입니다.");
  }

  static void echo() {
    System.out.println("야호!!!");
  }
}

// 매개변수가 있는 생성자가 필요
class Student implements Human {
  int age;
  public Student(int age) {
    this.age = age;
  }

  @Override
  public void print(){
    System.out.println(age + "세의 학생입니다.");
  }

  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }
}

class Worker implements Human {

  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}