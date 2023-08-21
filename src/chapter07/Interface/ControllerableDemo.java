package chapter07.Interface;

public class ControllerableDemo {
  public static void main(String[] args) {
//    TV tv1 = new TV();
//    tv1.turnOn();
//    tv1.turnOff();
//    tv1.repair();
//
//    TV tv2 = new TV();
//    tv2.RemoteOn();
//    tv2.RemoteOff();
//
//    Computer computer = new Computer();
//    computer.turnOn();
//    computer.turnOff();
//    computer.repair();
//// Computer.reset();
//    Controllable.reset();
//
//    NoteBook noteBook = new NoteBook();
//    noteBook.turnOn();
//    noteBook.turnOff();
//    noteBook.inMyBag();

//    한 곳에 담아보자
    Controllable[] controllables = {
      new TV(),
      new Computer(),
      new NoteBook()
    };

    for (Controllable controllable : controllables) {
      controllable.turnOn();
      controllable.turnOn();
      controllable.repair();
      Controllable.reset();

    }

//    controllables[0].turnOn();
//    controllables[1].turnOn();
//    controllables[2].turnOn();

  }
}
