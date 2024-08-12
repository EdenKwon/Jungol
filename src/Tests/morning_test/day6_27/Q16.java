package Tests.morning_test.day6_27;

public class Q16 {

  public static void main(String[] args) {
    MemeberService memberService = new MemeberService();
    boolean result = memberService.login("hong", "12345");
    if(result) {
      System.out.println("로그인 되었습니다.");
      memberService.logout("hong");
    } else {
      System.out.println("아이디나 비밀번호가 맞 지 않습니다.");
    }
  }
}
