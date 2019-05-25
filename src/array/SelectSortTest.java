package array;

public class SelectSortTest {
  public static void main(String[] args) {
    int[] arr = {231, 234, 444, 123};
    String s = "bcadfg";
    char[] chs = s.toCharArray();
    selectSort(chs);
    System.out.println(chs);
    selectSort(arr);
    printArray(arr);
  }
  public static void selectSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void selectSort(char[] chs) {
    for (int i = 0; i < chs.length - 1; i++) {
      for (int j = i + 1; j < chs.length; j++) {
        if (chs[i] > chs[j]) {
          char temp = chs[i];
          chs[i] = chs[j];
          chs[j] = temp;
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
