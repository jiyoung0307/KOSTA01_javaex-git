package classExample;

public class Course {
  private String id;
//  함부로 바꿀 수 없으니 Setter 생략
  private String name;
  private Integer numOfStudents;
//  함부로 바꿀 수 없으니 Setter 생략

  // Getter
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getNumOfStudents() {
    return numOfStudents;
  }

  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void addStudent(int student) {
    numOfStudents += student;
  }

  public void deleteStudent(int student) {
    numOfStudents -= student;
  }
}
