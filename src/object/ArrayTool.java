package object;

public class ArrayTool {
  private void ArrayTool() {}

  public static void printArr(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.println(arr[i]);
      } else {
        System.out.print(arr[i] + ",");
      }
    }
  }
}
