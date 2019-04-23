public class Multiplication {
  public static void main(String[] args) {
    // 乘法表
    for (int i = 1; i <= 9; i++) {
      for (int y = 1; y <= i; y++) {
        System.out.print(i + "*" + y + "=" + i * y + "\t");
      }
      System.out.println();
    }
  }
}
