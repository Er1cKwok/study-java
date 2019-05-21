package String;

import java.util.Scanner;

public class StringTest2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      char ch = s.charAt(i);
      s1 += ch;
    }
    System.out.println(s1);
  }
}
