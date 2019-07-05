package genericity;

public class Genericity<Type> {
  private Type obj;

  public void setObj(Type obj) {
    this.obj = obj;
  }

  public Type getObj() {
    return obj;
  }

  public <T> T show(T obj) {
    return obj;
  }
}
