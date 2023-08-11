package classExample;

public class PhoneEx {
  public static void main(String[] args) {
    Phone myPhone = new Phone("갤럭시S23", 1_000_000);
//    myPhone.model = "갤럭시S23";
//    myPhone.value = 1_000_000;
//    myPhone.print();
    System.out.println(Phone.getNumOfPhones() + "대가 생성되었습니다.");   // 지금 몇대야?
    myPhone.print();
//    myPhone.getNumOfPhones();
    System.out.println(myPhone.getNumOfPhones() + "대가 생성되었습니다.");

    Phone yourPhone = new Phone("아이폰i15", 1_200_000);
//    yourPhone.model = "아이폰i15";
//    yourPhone.value = 1_100_000;
//    yourPhone.print();
    System.out.println(Phone.getNumOfPhones() + "대가 생성되었습니다.");
    yourPhone.print();
//    yourPhone.getNumOfPhones();
    System.out.println("yourPhone이" + yourPhone.getNumOfPhones() + " 대가 생성되었습니다.");
    System.out.println("myPhone이" + myPhone.getNumOfPhones() + " 대가 생성되었습니다.");
  }
}
