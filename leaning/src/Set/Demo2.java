package Set;

import java.util.HashSet;
import java.util.Random;

public class Demo2 {
  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<Integer>();
    Random r = new Random();

    while (hs.size() < 10) {
      int num = r.nextInt(20) + 1;
      hs.add(num);
    }

    for (Integer i : hs) {
      System.out.println(i);
    }
  }
}
