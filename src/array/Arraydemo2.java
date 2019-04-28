package array;

public class Arraydemo2 {
  public static void main(String[] args) {
    int[][] arr = {{123,2321,423}, {23, 234, 11}};
    System.out.println(getSum(arr));

  }

  public static int getSum(int[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
    }

    return sum;
  }
}
