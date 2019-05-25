package array;

public class SearchTest {
  public static void main(String[] args) {
    int[] arr = {11, 22, 33, 44, 55, 66};
    int index = getIndex(arr, 22);
    System.out.println(index);

  }

  public static int getIndex(int[] arr, int value) {
    int max = arr.length - 1;
    int min = 0;
    int mid = (max + min) / 2;

    while (arr[mid] != value) {
      if (arr[mid] > value) {
        max = mid - 1;
      } else if (arr[mid] < value) {
        min = mid + 1;
      }

      mid = (max + min) / 2;

      if (min > max) {
        return -1;
      }
    }
    return mid;
  }
}
