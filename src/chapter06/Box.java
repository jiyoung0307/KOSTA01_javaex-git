package chapter06;

import javax.swing.*;

public class Box {
  String name;

  public Box(String name){
    this.name = name;
  }
}

class ColoeRedBox extends Box {
  public ColoeRedBox(String name) {
    super(name);
  }
}
