package array;

import java.lang.reflect.Array;

public class JiaMiDemo {
  public static void main(String[] args) {
    int number = 123456;
    jiami(number);
  }

  public static void jiami(int number) {
    int index = 0;
    int[] arr = new int[8];
    while (number > 0) {
      arr[index] = number % 10;
      index++;
      number /= 10;
    }

    for (int i = 0; i < index;  i++) {
      arr[i] += 5;
      arr[i] %= 10;
    }

    int temp = arr[0];
    arr[0] = arr[index - 1];
    arr[index - 1] = temp;

    int a = 0;
    for (int i = 0; i < index; i++) {
      System.out.print(arr[i]);
    }
  }
}
