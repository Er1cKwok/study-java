package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(20);
    list.add(50);
    list.add(40);
    list.add(30);
    list.add(10);

//    Collections.sort(list);
    Collections.shuffle(list);
//    System.out.println(Collections.max(list));
//    System.out.println(Collections.binarySearch(list, 10));
    System.out.println(list);
  }
}
