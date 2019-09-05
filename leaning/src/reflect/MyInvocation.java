package reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocation implements InvocationHandler {
  private Object target;

  public MyInvocation(Object target) {
    this.target = target;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
    System.out.println("权限");
    Object result = method.invoke(target, args);
    System.out.println("用户");

    return result;
  }
}
