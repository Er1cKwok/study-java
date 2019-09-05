package reflect;

public class Login implements LoginDao {
  public void log() {
    System.out.println("登录");
  }

  public void resist() {
    System.out.println("注册");
  }
}
