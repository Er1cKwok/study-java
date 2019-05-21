package String;

import java.util.Scanner;

public class StringTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    int bigLetter = 0;
    int smallLetter = 0;
    int number = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        smallLetter++;
      } else if (ch >= 'A' && ch <= 'Z') {
        bigLetter++;
      } else if(ch >= '0' && ch <= '9') {
        number++;
      }
    }

    System.out.println(bigLetter);
    System.out.println(smallLetter);
    System.out.println(number);
  }
}
