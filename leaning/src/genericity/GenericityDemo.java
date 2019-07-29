package genericity;

public class GenericityDemo {
  public static void main(String[] args) {
//    Genericity<String> gy = new Genericity<String>();
//
//    gy.setObj("Hello");
//    System.out.println(gy.getObj());
//    Genericity gy = new Genericity();
//    System.out.println(gy.show("asd"));
//    System.out.println(gy.show(100));

    InterImp<String> ii = new InterImp<String>();
    ii.show("nihao");
    InterImp<Integer> ii1 = new InterImp<Integer>();
    ii1.show(123);
  }
}
