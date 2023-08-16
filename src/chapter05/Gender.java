package chapter05;

import java.util.stream.Stream;

public enum Gender {
  MALE("남성"), FEMALE("여성");
  private String gender;

  private Gender(){}

  private Gender(String gender){
    this.gender = gender;
  }

  // Getter
  public String getGender(){
    return gender;
  }
}
