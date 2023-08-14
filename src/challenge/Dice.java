package challenge;

/*
 * 도전 과제 8. 주사위 모델링
 * 8. 주사위를 나타내는 Dice 클래스를 작성하고, 다음 코드를 사용해 테스트하라.
 *    (Hint.Math.random() 활용, Math.random 은 0보다 크거나 같고 1보다 작은 랜덤한 실수 값을 반환하는 메서드임)
 *    - double로 값이 나올 예정
*/
public class Dice {
//  [방법 1]
  public int roll() {
    return (int)(Math.random() * 6 + 1);
  }

//  [방법 2]
//  public int roll(){
//    return (int)Math.ceil((Math.random() * 6));
//  }

}
