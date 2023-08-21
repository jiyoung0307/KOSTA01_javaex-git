package chapter07.Interface;

public class ControllerableDemo {
  public static void main(String[] args) {
    TV tv1 = new TV();
    tv1.turnOn();
    tv1.turnOff();
    tv1.repair();

    TV tv2 = new TV();
    tv2.RemoteOn();
    tv2.RemoteOff();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    computer.repair();
// Computer.reset();
    Controllable.reset();

    NoteBook noteBook = new NoteBook();
    noteBook.turnOn();
    noteBook.turnOff();
    noteBook.inMyBag();
  }
}
