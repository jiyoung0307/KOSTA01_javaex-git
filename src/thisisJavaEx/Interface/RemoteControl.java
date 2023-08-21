package thisisJavaEx.Interface;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public interface RemoteControl {
  // public 추상 메소드
   void turnOn();
}

class Television implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("TV를 킵니다...");
  }
}

class Audio implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("Audio를 켭니다...");
  }
}
