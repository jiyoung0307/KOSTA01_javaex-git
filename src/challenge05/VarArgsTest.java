package challenge05;

public class VarArgsTest {
  public static void main(String[] args) {
    /*
     * 다음 코드를 실행하면 9, 5, 14를 두 번 출력한다. 여기서 sum()메소드 하나로 완성하시오
     * (힌트) 자바는 가변 길이 변수를 배열처럼 취급한다.
     */
    int[] arr = {2,3};
    System.out.println(sum(3,2,3,4));
    System.out.println(sum(4, arr));
    System.out.println(sum(5,2,3,4,5));

    System.out.println();
  }

  /* 가변변수는 맨 끝으로 와야 한다. */
  static int sum(int number, int...numbers) {
    int sum =0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
