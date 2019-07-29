package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
  public static void main(String[] args) {
    Map<Integer, String> map1 = new HashMap<Integer, String>();

    map1.put(1, "Eric");
    map1.put(2, "Janice");
    map1.put(3, "Daisy");

    System.out.println(map1.remove(2));
    System.out.println(map1.containsKey(1));
    System.out.println(map1.get(1));
    Set<Integer> set = map1.keySet();
    for (Integer i : set) {
      System.out.println(i);
    }
    Collection<String> col = map1.values();
    for (String s : col) {
      System.out.println(s);
    }
  }
}
