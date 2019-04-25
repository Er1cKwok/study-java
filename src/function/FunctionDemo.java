package function;
import java.util.Scanner;

public class FunctionDemo {
  public static void main(String[] args) {
    // 方法重载，可重复申明同名函数
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();

//    int max = getMax(a, b, c);
//    System.out.println(max);
//    stars(a, b);
    multiplication(a);
  }

  public static int getMax(int a, int b, int c) {
    if (a > b) {
      return a > c ? a : c;
    } else {
      return b > c ? b : c;
    }
  }

  public static void stars(int a, int b) {
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void multiplication(int a) {
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + "*" + j + "=" + i * j + "\t");
      }
      System.out.println();
    }
  }
}
