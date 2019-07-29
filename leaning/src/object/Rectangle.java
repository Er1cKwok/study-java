package object;

public class Rectangle {
  public static void main(String[] args) {
    RectangleDemo r = new RectangleDemo();
    r.setLength(20);
    r.setWidth(10);
    System.out.println(r.getPerimeter());
    System.out.println(r.getArea());
  }
}

class RectangleDemo {
  private int length;
  private int width;

  public void RectangleDemo() {}

  public void setLength(int length) {
    this.length = length;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getPerimeter() {
    return (this.length + this.width) * 2;
  }

  public int getArea() {
    return this.length * this.width;
  }
}
