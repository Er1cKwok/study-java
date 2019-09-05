package reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo6 {
  public static void main(String[] args) throws Exception {
    ArrayList arr = new ArrayList();

    Class c = arr.getClass();

    Method m = c.getMethod("add", Object.class);

    m.invoke(arr, "你好");
    m.invoke(arr, "你好1");
    m.invoke(arr, "你好2");
    System.out.println(arr);
  }
}
