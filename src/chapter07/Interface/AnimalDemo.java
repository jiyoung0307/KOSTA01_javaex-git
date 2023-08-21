package chapter07.Interface;

public class AnimalDemo {
  public static void main(String[] args) {
    // 메소드를 매개변수로 보내는 거
    Dog dog = new Dog();
    Cuckoo cuckoo = new Cuckoo();

    makeSound(dog);
    makeSound(cuckoo);
  }

  private static void makeSound(Animal animal) {
    animal.sound();
//    animal.run();
//    animal.fly();

//    만일 Dog에만 있는 run과 Cuckoo에만 있는 fly를 동시에 실행하고 싶을 경우 if문을 사용해준다
    if(animal instanceof Dog) {
//      ((Dog)animal).run();
      Dog dog = (Dog)animal;
      dog.run();
    } else if (animal instanceof Cuckoo){
      ((Cuckoo)animal).fly();
    }
  }
}

interface Animal{
  void sound();
}

class Dog implements Animal{
  @Override
  public void sound() {
    System.out.println("멍멍~~");
  }

  public void run(){
    System.out.println("달린다.");
  }
}

class Cuckoo implements Animal {
  @Override
  public void sound() {
    System.out.println("뻐꾹뻐꾹~~");
  }

  public void fly(){
    System.out.println("날아간다.");
  }
}
