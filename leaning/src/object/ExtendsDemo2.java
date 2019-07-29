package object;

class Fu {
  int num = 10;
}

class Son1 extends Fu {
  int num = 20;

  public void show() {
    int num = 30;
    System.out.println(this.num);
    System.out.println(super.num);
    System.out.println(num);
  }
}

public class ExtendsDemo2 {
  public static void main(String[] args) {
    Son1 s1 = new Son1();
    s1.show();
  }
}
