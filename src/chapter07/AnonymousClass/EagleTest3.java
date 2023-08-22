package chapter07.AnonymousClass;

import javax.swing.*;

public class EagleTest3 {
  // 멤버 클래스
  ABird ab = new ABird(){
    void fly(){
      System.out.println("독수리가 날아~~");
    }
  };

  // 메소드
  public static void main(String[] args) {
    EagleTest3 eagleTest3 = new EagleTest3();
    eagleTest3.ab.fly();
  }

}
