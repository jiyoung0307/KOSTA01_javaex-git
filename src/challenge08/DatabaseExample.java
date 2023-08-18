package challenge08;

public class DatabaseExample {
  public static void main(String[] args) {
//    MySQL mySQL = new MySQL();
//    mySQL.use();
//    mySQL.use();
//    mySQL.use();

//    Oracle oracle = new Oracle();
//    oracle.use();
//    oracle.use();
//    oracle.use();

    // 의존성 주입 : 코드를 바꾸지 않고 사용성 향상
    // new
    Database database = new MySQL();
    database.use();
    database.use();
    database.use();
  }
}
