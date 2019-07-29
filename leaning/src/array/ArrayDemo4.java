package array;

public class ArrayDemo4 {
  public static void main(String[] args) {
    int ab = sum(33, 231, 231);
    System.out.println(ab);
  }

  public static int sum(int... args) {
    int x = 0;
    for (int a : args) {
      x += a;
    }

    return x;
  }
}
