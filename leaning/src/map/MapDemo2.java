package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
  public static void main(String[] args) {
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("Eric", "Janice");
    map1.put("郭靖", "王蓉");
    map1.put("杨过", "小龙女");

//    Set<String> set = map1.keySet();
//    for (String s : set) {
//      String couple = map1.get(s);
//      System.out.println(s + "----" + couple);
//    }
    Set<Map.Entry<String, String>> set1 = map1.entrySet();
    for (Map.Entry<String, String> obj : set1) {
      String key = obj.getKey();
      String value = obj.getValue();
      System.out.println(key + "---" + value);
    }
  }
}
