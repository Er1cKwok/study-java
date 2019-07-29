package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<String> arrlis = new ArrayList<String>();
    arrlis.add("Hello");
    arrlis.add("world");
    arrlis.add("java");

    Iterator<String> it = arrlis.iterator();
    while (it.hasNext()) {
      String s = it.next();
      System.out.println(s);
    }
  }
}
