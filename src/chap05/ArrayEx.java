package chap05;

public class ArrayEx {
  public static void main(String[] args) {
//    int sum = 0, avg = 0;
    int sum = 0;
    int avg = 0;

    int sc1 = 90;
    int sc2 = 80;
    int sc3 = 100;

    sum = sc1 + sc2 + sc3;
    avg = sum / 3;

//    초기화
    sum = 0;
    avg = 0;
//    compiler가 알아서 int형으로 초기화해줌
    int[] scores = new int[5];    // 12byte (4 * 3)
    scores[0] = 90;
    scores[1] = 80;
    scores[2] = 100;
    scores[3] = 100;
    scores[4] = 90;

//    반복문으로 처리해보자
//    sum = scores[0] + scores[1] + scores[3];
    for (int i = 0; i < scores.length; i++) {
//      sum = sum + scores[i];
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d, avg = %d", sum, avg);
  }
}
