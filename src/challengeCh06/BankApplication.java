package challengeCh06;

import java.util.Scanner;

public class BankApplication {

  static challengeCh06.BankAccount[] bankAccounts = new challengeCh06.BankAccount[100];
  static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int opt = 0;

    while (true) {
      System.out.println("---------------------------------------------------");
      System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
      System.out.println("---------------------------------------------------");
      System.out.print("선택>");
      opt = in.nextInt();
      if (opt == 5) {
        System.out.println("프로그램 종료");
        break;
      }
      switch (opt) {
        case 1:
          createAccount();
          break;  // 계좌 생성
        case 2:
          accountList();
          break;    // 계좌 목록
        case 3:

          depositMoney();
          break;   // 예금
        case 4:
          withdrawMoney();
          break;   // 출금
      }
    }
  }

// 계좌 생성
  static void createAccount() {
    System.out.println("------");
    System.out.println("계좌생성");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo = in.next();     // 변수1
    System.out.print("예금주 : ");
    String accountOwner = in.next();  // 변수2
    System.out.print("초기입금액 : ");
    int balance = in.nextInt();        // 변수3

    for (int i = 0; i < bankAccounts.length; i++) {     // for문을 돌리면서 빈 공간이 있으면 값을 넣고 빠져나오게 설정
      if (bankAccounts[i] == null) {
        // 동일 계좌가 있다면 실행 X
        challengeCh06.BankAccount bankAccount = new challengeCh06.BankAccount(accountNo, accountOwner, balance);    // 외부 필드 사용
        bankAccounts[i] = bankAccount;  // 계좌 생성
        break;    // 무조건 100번 실행하지 않게 break
      } else if (bankAccounts[i].getAccountNo().equals(accountNo)) {    // 같은 계좌번호인지 확인
        System.out.println("계좌생성 오류 : [원인 - 동일 계좌 존재]");
        break;
      }
    }
  }

        // 계좌 목록
        static void accountList() {
          System.out.println("-------");
          System.out.println("게좌목록");
          System.out.println("-------");
          for (int i = 0; i < bankAccounts.length; i++) {
            if (bankAccounts[i] == null) {    // NullPointerException 처리 (Null인데 자꾸 참조하니 나오는 에러)
        break;
      } else {
        System.out.printf("계좌번호 : %s \n 계좌주 : %s \n 잔액 : %d \n",
            bankAccounts[i].getAccountNo(),
            bankAccounts[i].getAccountOwner(),
            bankAccounts[i].getBalance());
      }
    }
  }

// 예금
  static void depositMoney() {
    System.out.println("------");
    System.out.println(" 얘금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo = in.next();
    System.out.print("예금액 : ");
    int money = in.nextInt();
    int findIndex = findIndex(accountNo);
    bankAccounts[findIndex].deposit(money);
//    findAccount();
//    account.deposit();
//    int money = in.nextInt();
//    for (challengeCh06.BankAccount bankAccount : bankAccounts) {
//      if (bankAccount == null) {    // NullPointerException 처리 (Null이면 비교할 수 없으니까)
//        break;
//      } else if (bankAccount.getAccountNo().equals(accountNo)) {    // 계좌번호가 동일한지 확인
//        bankAccount.deposit(money);   // money를 인자로 넘김
//        break;
//      }
//    }
  }

  // 출금
  static void withdrawMoney() {
    System.out.println("------");
    System.out.println(" 출금");
    System.out.println("------");
    System.out.print("계좌번호 : ");
    String accountNo = in.next();
    System.out.print("출금액 : ");
    int money = in.nextInt();
//    int indexAccount = findIndex(accountNo);
    int findIndex = findIndex(accountNo);
    bankAccounts[findIndex].withdraw(money);
  }

  // 동일한 계좌정보가 존재하는지 찾는 메소드 필요해서 리페터링 진행
  static int findIndex(String accountNo){
    int index = -1;
    for (int i = 0; i < bankAccounts.length; i++) {
      if(bankAccounts[i] == null) break;
      if(bankAccounts[i].getAccountNo().equals(accountNo)){
        index = i;
      }
    }
    return index;
  }
}
