package classExample2;
// 이름, 아이디, 암호, 나이
// 직접 접근 X, 접근자와 설정자로만 접근
// Setter 이름, 나이

public class Member {

//  필드 : 이름, 아이디, 암호, 나이
  private String name;
  private String id;
  private String pwd;
  private int age;

// 생성자 (모든 회원 정보 사용)
  public Member(String name, String id, String pwd, int age) {
    this.name = name;
    this.id = id;
    this.pwd = pwd;
    this.age = age;
  }
// Getter
  public String getName() {
    return name;
  }

  public String getId() {
    return id;
  }

  public String getPwd() {
    return pwd;
  }

  public int getAge() {
    return age;
  }
  // 설정자(이름, 나이(0 ~ 120))
  public void setName(String name) {
    this.name = name;
  }
// 설정자(이름, 나이(0 ~ 120))
  public void setAge(int age) {
    if(age > 120 && age < 0) {
      System.out.println("120살은 입장하기 어렵습니다.");
    } else {
      this.age = age;
    }
  }


}

