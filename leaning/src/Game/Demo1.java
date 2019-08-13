package Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Demo1 {
  public static void main(String[] args) {
    String[] colors = {"♠️", "♥️", "♣️", "◆"};
    String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",};
    ArrayList<Integer> array = new ArrayList<Integer>();
    HashMap<Integer, String> hm = new HashMap<Integer, String>();
    int index = 0;
    for (String number : numbers) {
      for (String color : colors) {
        String poker = color.concat(number);
        hm.put(index, poker);
        array.add(index);
        index++;
      }
    }
    hm.put(index, "大王");
    array.add(index);
    index++;
    hm.put(index, "小王");
    array.add(index);
    Collections.shuffle(array);
    TreeSet<Integer> janice = new TreeSet<Integer>();
    TreeSet<Integer> eric = new TreeSet<Integer>();
    TreeSet<Integer> daisy = new TreeSet<Integer>();
    TreeSet<Integer> dipai = new TreeSet<Integer>();


    for (int i = 0; i < array.size(); i++) {
      if (i >= array.size() - 3) {
        dipai.add(array.get(i));
      } else if (i % 3 == 0) {
        janice.add(array.get(i));
      } else if (i % 3 == 1) {
        eric.add(array.get(i));
      } else if (i % 3 == 2) {
        daisy.add(array.get(i));
      }
    }

    lookerPokers("Janice", janice, hm);
    lookerPokers("Eric", eric, hm);
    lookerPokers("Daisy", daisy, hm);
    lookerPokers("dipai", dipai, hm);
  }

  public static void lookerPokers(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
    System.out.print(name + "的牌是：");
    for (Integer key : ts) {
      System.out.print(hm.get(key) + " ");
    }
    System.out.println();
  }
}
