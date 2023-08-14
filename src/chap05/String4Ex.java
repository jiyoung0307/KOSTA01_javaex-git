package chap05;

public class String4Ex {
  public static void main(String[] args) {
    String java = String.format("%s %.1f", "Java", 14);
    System.out.println(java);

    String join = String.join(",", "apple", "banana");
    System.out.println(join);

    // 정적메소드
    String s = String.valueOf(100_000_000_000L);
  }
}
