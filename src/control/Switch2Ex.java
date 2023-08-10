package control;

public class Switch2Ex {
  public static void main(String[] args) {
    whoIsIt("호랑이");
    whoIsIt("사자");
    whoIsIt("매미");
  }

    static String whoIsIt(String bio) {
    String kind ="";
    switch (bio){
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      case "고등어":
      case "참돔":
        kind = "어류";
        break;
      default:
        kind="해당없음";
    }
      System.out.printf("%s는 %s입니다.", bio, kind);
    return kind;
  }
}
