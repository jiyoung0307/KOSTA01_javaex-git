package classExample;

  public class Phone {
    String model;
    int value;

//    기본생성자
    public Phone(){}

    public Phone(String model,int value){
      this.model = model;
      this.value = value;
    }

    void print(){
      System.out.println(value + "원 짜리 " + model + " 의 스마트폰임");
    }
  }
