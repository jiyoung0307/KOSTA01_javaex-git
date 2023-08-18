package challenge07;

public class Activity {
  public void onCreate(){
    System.out.println("기본적인 실행 내용");
  }
}

class MainActivity extends Activity {
  @Override
  public void onCreate() {
    // 부모의 Activity도 같이 실행하기 위해서는 super 사용
    super.onCreate();
    System.out.println("추가적인 실행 내용");
  }
}
