package challenge06;

// chap06 클래스
// p280 18

// 싱글톤패턴
public class ShopService {
//  private 접근 제한을 갖는 정적 필드 선언과 초기화

  // static 작성하는 이유?
  // 인스턴스를 만들지 않고도 객체를 써야 하니까 작성
  private static ShopService shopService = new ShopService();

//  private 접근 제한을 갖는 생성자 선언(객체 빌려줘)
  private ShopService() {

  }
//
  public static ShopService getInstance(){
    return shopService;
  }
}
