package challenge06;

// chap06 클래스
// p279 15
public class MemberService {
  boolean login(String id, String password) {
    if(id.equals("kim") && password.equals("qwert")){
      return true;
    }
    return false;
  }

  void logout(String id){
    System.out.println(id + "님이 로그아웃 되었습니다.");
  }
}
