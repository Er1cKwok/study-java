package TreeMap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ling = sc.nextLine();
    char[] chs = ling.toCharArray();
    TreeMap<Character, Integer> tmap = new TreeMap<Character, Integer>();
    for (char ch : chs) {
      Integer num = tmap.get(ch);
      if (num == null) {
        tmap.put(ch, 1);
      } else {
        num++;
        tmap.put(ch, num);
      }
    }
    Set<Character> set = tmap.keySet();
    StringBuffer sb = new StringBuffer();
    for (char c : set) {
      sb.append(c).append('(').append(tmap.get(c)).append(')');
    }
    System.out.println(sb);
  }
}
