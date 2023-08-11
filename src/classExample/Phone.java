package classExample;

  public class Phone {
    private static long numOfPhones;

    String model;
    int value;


//    기본생성자
//    public Phone(){}

    public Phone(String model,int value){
      this.model = model;
      this.value = value;
      numOfPhones++;  // 생성될 때마다 하나씩 증가
    }
//    Getter
    public static long getNumOfPhones() {
      return numOfPhones;
    }

    void print(){
      System.out.println(value + "원 짜리 " + model + " 의 스마트폰임");
    }
  }
