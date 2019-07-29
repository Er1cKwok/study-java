package HashMap;

import java.util.HashMap;
import java.util.Set;

public class Demo1 {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Eric", "Janice");
    map.put("郭靖", "王蓉");
    map.put("杨过", "小龙女");

    Set<String> set = map.keySet();
    for (String key : set) {
      String value = map.get(key);
      System.out.println(key + " ---" + value);
    }
  }
}
