package chapter05;

public class String3Ex {
  public static void main(String[] args) {
    String s1 = "Hi, Java";
    String s2 = "!!!";
//    빈칸도 하나의 문자로 취급
    System.out.println(s1.charAt(4));
    System.out.println(s1.concat(s2));

    String s3 = " ";    // Blank (o) / Empty (x)
    String  s4 = "" ;   // Blank (o) / Empty (o)
    System.out.println("s3.isEmpty() => " + s3.isEmpty());
    System.out.println("s4.isEmpty() => " + s4.isEmpty());

    System.out.println("s3.isBlank() => " + s3.isBlank());
    System.out.println("s4.isBlank() => " + s3.isBlank());

    // toLowerCase(), toUpperCase()는 내부적으로 값이 바뀌는 것이 아니라 내가 보는 화면에서만 변환해주는 것
    System.out.println("s1.toLowerCase() : " + (s1.toLowerCase()));
    System.out.println("s1.toUpperCase() : " + (s1.toUpperCase()));
    System.out.println("s1 : " + s1);

    System.out.println("s1.substring(4) : " + (s1.substring(4)));
    System.out.println("s1.substring(4,6) : " + (s1.substring(4,6)));

    System.out.println("s1.length() : " + (s1.length()));

  }
}
