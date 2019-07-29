package TreeMap;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
  public static void main(String[] args) {
    TreeMap<String, ArrayList<String>> tmap = new TreeMap<String, ArrayList<String>>();
    ArrayList<String> array1 = new ArrayList<String>();
    array1.add("刘备");
    array1.add("关羽");
    ArrayList<String> array2 = new ArrayList<String>();
    array2.add("令狐冲");
    array2.add("林平之");
    ArrayList<String> array3 = new ArrayList<String>();
    array3.add("黄蓉");
    array3.add("郭靖");
    tmap.put("三国演义", array1);
    tmap.put("笑傲江湖", array2);
    tmap.put("天龙八部", array3);
    Set<String> set = tmap.keySet();
    for (String key : set) {
      ArrayList<String> array = tmap.get(key);
      for (String s : array) {
        System.out.println(key + "--" + s);
      }
    }
  }
}
