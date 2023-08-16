package challengeCh05;

public enum Month {
  JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6),
  JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);

  // 필드
  private int month;

  // 생성자
//  private Month(){};

  private Month(int month) {
    this.month = month;
  }

  // 메소드
  public int getMonth(){
    return month;
  }
}
