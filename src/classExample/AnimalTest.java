package classExample;

public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();

    Bird bird = new Bird();
    bird.날아간다();
    bird.먹는다();

    Tiger tiger = new Tiger();
    tiger.달린다();
    tiger.숨쉰다();

    Animal animal = new Animal();
    animal.먹는다();
    animal.움직인다();
    animal.숨쉰다();
  }
}
