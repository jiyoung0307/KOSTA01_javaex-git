package chapter05;

public class EnumEx {
  public static void main(String[] args) {
    People people = new People();

    /* 사람 1 */
    people.age = 20;
    people.gender = Gender.MALE;
    people.direction = Direction.EAST;

    /* 사람 2 */
    People anotherPeople = new People();
    anotherPeople.age = 30;
    anotherPeople.gender = Gender.MALE;
    anotherPeople.direction = Direction.WEST;

    if (people.gender == anotherPeople.gender) System.out.println("남성입니다.");
    if (people.direction.compareTo(anotherPeople.direction) ==0) {
      System.out.println("같은 방향입니다.");
    } else {
//      System.out.println("다른 방향입니다 : " + people.direction.compareTo(anotherPeople.direction));  // -1
      System.out.println("다른 방향입니다 : " + anotherPeople.direction.compareTo(people.direction));    // +1
    }
    System.out.println("people.gender = " + (people.gender));
    System.out.println("people.direction = " + (people.direction));



//    System.out.println("Gender.valueOf(people.gender.name()) : " + (Gender.valueOf(people.gender.name())));
    System.out.println("people.gender.getGender() : "+ (people.gender.getGender()));
    System.out.println("people.gender.name() : " + people.gender.name());
    System.out.println("people.gender.ordinal() : " + (people.gender.ordinal()));
  }
}

// 설계도
class People {
  int age;
  Gender gender;
  Direction direction;
  static final int EAST = 0;
  static final int WEST = 1;
//  static final int SOUTH = 3;
//  static final int NORTH = 4;
}

class People1 {

}
