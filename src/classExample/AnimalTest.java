package classExample;

//객체
public class AnimalTest {
  public static void main(String[] args) {
    Object obj = new Object();

    Bird bird = new Bird();
    bird.움직인다();
    bird.먹는다();

    Tiger tiger = new Tiger();
    tiger.움직인다();
    //tiger.달린다();
    tiger.숨쉰다();

    Animal animal = new Animal();
    animal.움직인다();

    Fish fish = new Fish();
    fish.움직인다();
  }
}
