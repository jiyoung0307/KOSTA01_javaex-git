package challengeCh07;

public class InheritanceTest {
}

class Parent {
  public String name;

  public Parent(String name) {
    this.name = name;
  }
}

class Child extends Parent {
  public int studentNo;

  public Child(String name, int studentNo) {
//  부모 생성자를 호출
    super(name);
    this.name = name;
    this.studentNo = studentNo;
  }
}
