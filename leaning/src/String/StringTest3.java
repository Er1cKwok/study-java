package String;

public class StringTest3 {
  public static void main(String[] args) {
    String big = "woaijavaniaijavawobuaijavagas";
    String small = "java";
    int index = big.indexOf(small);
    int count = 0;
    while (index != -1) {
      count++;

      int startIndex = index + small.length();
      big = big.substring(startIndex);
      index = big.indexOf(small);
    }
    System.out.println(count);
  }
}
