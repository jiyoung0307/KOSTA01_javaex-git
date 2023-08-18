package challengeCh06;

public class Member {
  // chap06 클래스
// p278 13,14
  // 필드
  String name;
  String id;
  String password;
  int age;

  // 생성자
  public Member(String name, String id, String password, int age) {
    this.name = name;
    this.id = id;
    this.password = password;
    this.age = age;
  }

  public String findName(String id) {
    return name;
  }
}
