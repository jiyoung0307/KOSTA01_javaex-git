package classExample;

//객체
public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();

//    1. 참조 변수 선언 -> 객체 생성 (메모리 확보)
//    2. Bird 생성 -> 값이 존재하지 않으므로 null이라고 임시로 지정
//    3. bird에 값 할당된다
    int num = 10;
    Bird bird = null;
    System.out.println("bird = " + bird);

    bird = new Bird();
    System.out.println("bird = " + bird);

    bird.움직인다();
    bird.먹는다();

    Tiger tiger = new Tiger();
    System.out.println("tiger = " + tiger);
    tiger.움직인다();
    //tiger.달린다();
    tiger.숨쉰다();

    Animal animal = new Animal();
    System.out.println("animal = " + animal);
    animal.움직인다();

    Fish fish = new Fish();
    System.out.println("fish = " + fish);
    fish.움직인다();
  }
}
