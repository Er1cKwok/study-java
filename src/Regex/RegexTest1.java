package Regex;

import java.util.Scanner;

public class RegexTest1 {
  public static void main(String[] args) {
    String a = "18-24";
    String[] as = a.split("-");
    int start = Integer.parseInt(as[0]);
    int end = Integer.parseInt(as[1]);
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if (age <= start || age >= end) {
      System.out.println("Get out");
    } else {
      System.out.println("You are the best");
    }

  }
}
