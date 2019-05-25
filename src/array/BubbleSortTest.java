package array;

public class BubbleSortTest {
  public static void main(String[] args) {
    int[] arr = {231, 234, 444, 123};
    bubbleSort(arr);
    printArray(arr);
  }

  public static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  public static void printArray(int[] arr) {
    System.out.print('[');
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.print(arr[i]);
      } else {
        System.out.print(arr[i] + ", ");
      }
    }
    System.out.println(']');
  }
}
