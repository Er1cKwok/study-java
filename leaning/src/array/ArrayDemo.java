package array;

public class ArrayDemo {
  public static void main(String[] args) {

    int arr1[] = {321, 12, 23, 32, 1};

    printArray(arr1);
    reverse(arr1);
    printArray(arr1);
  }

  public static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        System.out.println(arr[i] + "]");
      } else {
        System.out.print(arr[i] + ", ");
      }
    }
  }

  public static void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - 1 - i];
      arr[arr.length - 1 - i] = temp;
    }
  }
}
