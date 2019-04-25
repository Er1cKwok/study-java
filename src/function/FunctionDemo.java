package function;
import java.util.Scanner;

public class FunctionDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int max = getMax(a, b, c);
    System.out.println(max);
  }

  public static int getMax(int a, int b, int c) {
    if (a > b) {
      return a > c ? a : c;
    } else {
      return b > c ? b : c;
    }
  }
}
