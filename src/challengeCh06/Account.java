package challengeCh06;

public class Account {
  // 상수로 필드 값 0으로 고정 (final)
  private final int MIN_VALUE = 0;
  private final int MAX_VALUE = 1_000_000;
  // 필드
  private int balance;

  public void setBalance(int balance) {
    if (balance >= MIN_VALUE && balance <= MAX_VALUE) {
      this.balance = balance;
    }
  }

  public int getBalance() {
    return balance;
  }

  public void withdraw(int money) {
    if (money >= 0) {
      int remains = balance - money;
      if (remains >= MIN_VALUE && remains <= MAX_VALUE) {
        balance = remains;
      }
    }
  }

  public void deposit(int money) {
    if (money > 0) {
      int remains = balance + money;
      if (remains >= MIN_VALUE && remains <= MAX_VALUE) {
        balance = remains;
      }
    }
  }
}
