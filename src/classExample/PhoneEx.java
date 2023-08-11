package classExample;

public class PhoneEx {
  public static void main(String[] args) {
    Phone myPhone = new Phone();
    myPhone.model = "갤럭시 S23";
    myPhone.value = 1_000_000;
    myPhone.print();
    System.out.println("myPhone = " + myPhone);

    Phone yourPhone = new Phone();
    yourPhone.model = "아이폰i15";
    yourPhone.value = 1_100_000;
    yourPhone.print();
    System.out.println("yourPhone = " + yourPhone);
  }
}
