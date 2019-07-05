package Random;

import java.util.ArrayList;
import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random r = new Random();
    ArrayList<Integer> ali = new ArrayList<Integer>();
    int number = 0;

    while (number < 10) {
      int n = r.nextInt(20) + 1;
      if (!ali.contains(n)) {
        ali.add(n);
        number ++;
      }
    }

    for (int i : ali) {
      System.out.println(i);
    }
  }
}
