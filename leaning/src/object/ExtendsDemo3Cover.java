package object;

class Phone2 {
  public void call(String name) {
    System.out.println(name);
  }
}

class NewPhone2 extends Phone2 {
  public void call(String name) {
    super.call(name);
    System.out.println("这是一段天气预报");
  }
}

public class ExtendsDemo3Cover {
  public static void main(String[] args) {
    NewPhone2 np2 = new NewPhone2();
    np2.call("Eric");
  }
}
