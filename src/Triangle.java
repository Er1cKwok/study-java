public class Triangle {
  public static void main(String[] args) {
    // 5行三角形星星
    for (int i = 0; i < 5; i ++) {
      for (int y = 0; y <= i; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
