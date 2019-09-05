package reflect;

import java.lang.reflect.Proxy;

public class Test {
  public static void main(String[] args) {
    LoginDao login = new Login();
    login.log();
    login.resist();
    System.out.println("-------");
    MyInvocation my1 = new MyInvocation(login);

    LoginDao proxyLogin = (LoginDao) Proxy.newProxyInstance(login.getClass().getClassLoader(), login.getClass().getInterfaces(), my1);

    proxyLogin.log();
    proxyLogin.resist();
  }
}
