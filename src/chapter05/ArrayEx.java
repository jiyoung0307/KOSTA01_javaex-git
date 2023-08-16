package chapter05;

public class ArrayEx {
  public static void main(String[] args) {
    /*
     * 1. 배열 선언
     * ex) int[] scores;
     * 2. 참조 변수에 대입
     * 3. new 작성
     * ex) score = new in[5];
     */

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
//    int[] scores = new int[5];    // 12byte (4 * 3)
//    scores[0] = 90;
//    scores[1] = 80;
//    scores[2] = 100;
//    scores[3] = 100;
//    scores[4] = 90;

    /* 변수 = 참조하는 값 */
//    방법1)
    int[] scores = {90, 80, 100};

//    방법2)
//    int[] scores = new int[] {90, 80, 100, 100, 90};

//    방법3)
//    int[] scores;
//    scores = new int[]{90, 80, 100, 100, 90};

//    방법4) 사용하면 안되는 방법 XXX
//    int[] scores;
//    scores = {90, 80, 100, 100, 90};

//    반복문으로 처리해보자
//    sum = scores[0] + scores[1] + scores[3];
    for (int i = 0; i < scores.length; i++) {
//      sum = sum + scores[i];
      sum += scores[i];
    }
    avg = sum / scores.length;
    System.out.printf("sum = %d, avg = %d", sum, avg);

//    크기를 동적으로 늘려보자
    int[] scoresBig = new int[6];
    for (int i = 0; i < scores.length; i++) {
      scoresBig[i] = scores[i];
    }
//    scores에 scoresBig의 주소 할당
    scores = scoresBig;
    scores[3] = 110;
    for (int i = 0; i < scores.length; i++) {
      System.out.println("scores[i] = " + scores[i]);
    }

//    foreach문
    for (int score : scores ) {
      System.out.println(score);
    }
  }
}