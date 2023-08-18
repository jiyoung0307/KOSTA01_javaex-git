package challenge08;

public interface Database {
  void use();
}

class MySQL implements Database {
  @Override
  public void use() {
    System.out.println("MySQL을 사용합니다.");
  }
}

class Oracle implements Database {
  @Override
  public void use() {
    System.out.println("Oracle을 사용합니다.");
  }
}
