package Game;

import java.util.Scanner;

public class GuessNumber {
  public static void start() {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("请输入你要猜的数字：");
    int guessNum = (int)(Math.random() * 100) + 1;

    while (true) {
      int num = sc.nextInt();
      count++;
      if (num > guessNum) {
        System.out.println("你输入的数字大了");
      } else if (num < guessNum) {
        System.out.println("你输入的数字小了");
      } else {
        System.out.println("恭喜你，猜中了，共" + count + "次");
        break;
      }
    }
  }
}
