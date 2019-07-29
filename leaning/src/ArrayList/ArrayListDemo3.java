package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> alis = new ArrayList<Integer>();
    while (true) {
      int num = sc.nextInt();
      if (num != 0) {
        alis.add(num);
      } else {
        break;
      }
    }

    Integer[] i = new Integer[alis.size()];
    alis.toArray(i);
    Arrays.sort(i);
    System.out.println(i[i.length - 1]);
  }
}
