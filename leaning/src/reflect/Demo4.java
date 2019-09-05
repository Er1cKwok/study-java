package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo4 {
  public static void main(String[] args) throws Exception{
    Class c = Class.forName("reflect.Person");

    Constructor con = c.getConstructor();
    Object obj = con.newInstance();

    Method m1 = c.getMethod("show");

    m1.invoke(obj);

  }
}
