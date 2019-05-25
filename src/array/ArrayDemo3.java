package array;

import java.util.Arrays;

public class ArrayDemo3 {
  public static void main(String[] args) {
    int[] arr = {123, 322, 55, 3321};
    System.out.println("排序前" + Arrays.toString(arr));
    Arrays.sort(arr);
    System.out.println("排序后" + Arrays.toString(arr));
    int index = Arrays.binarySearch(arr, 322);
    System.out.println(index);
  }
}
