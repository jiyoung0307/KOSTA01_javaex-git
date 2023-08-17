package chapter06;

import javax.swing.*;

public class Box {
// 필드
  String name;
// 생성자
  public Box(String name){
    this.name = name;
  }
}

class ColoeRedBox extends Box {
  public ColoeRedBox(String name) {
    super(name);
  }
}
