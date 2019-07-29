package genericity;

public class InterImp<T> implements Inter<T> {
  @Override
  public void show(T obj) {
    System.out.println(obj);
  }
}
