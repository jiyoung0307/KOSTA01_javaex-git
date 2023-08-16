package chapter05;

public enum Grade {
  A("Excellent"), B("Good"), C("So so");

  // 필드
  private String grade;

  // 생성자
  private Grade(){}

  private Grade(String grade) {
    this.grade = grade;
  }

// 메소드
  public String getGrade() {
    return grade;
  }
}

