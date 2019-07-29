package String;

public class StringTest1 {
  public static void main(String[] args) {
    String s = "JaveSe";
    byte[] by = s.getBytes();
    for (int i = 0; i < by.length; i++) {
      System.out.println(by[i]);
    }
    System.out.println("-----------");

    String ss = "helloWORLD";
    String s1 = ss.substring(0, 1);
    String s2 = ss.substring(1);
    System.out.println(s1.toUpperCase() + s2.toLowerCase());

  }
}
