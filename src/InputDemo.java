import java.util.Scanner;

public class InputDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入1：");
    int x = sc.nextInt();
    System.out.println("请输入2：");
    int y = sc.nextInt();
    System.out.println(x + y);

  }
}
