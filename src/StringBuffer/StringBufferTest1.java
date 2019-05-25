package StringBuffer;

public class StringBufferTest1 {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();
    sb.append("Hello").append("world").append("java");
    String ss = sb.substring(5, 10);
    System.out.println(ss);
    System.out.println("-------");
    StringBuffer sbba = new StringBuffer("java");
    String strr = sbba.toString();
    String sd = new String(sbba);
    System.out.println(strr);
    System.out.println(sd);
    System.out.println("--------");

    int[] arr = {22, 33, 344, 53};
    String arrStr = arrayToString(arr);
    System.out.println(arrStr);
  }

  public static String arrayToString(int[] arr) {
    StringBuffer sb = new StringBuffer();
    sb.append('[');
    for (int i = 0; i < arr.length; i++){
      if (i == arr.length - 1) {
        sb.append(arr[i]);
      } else {
        sb.append(arr[i]).append(", ");
      }
    }
    sb.append(']');
    return sb.toString();
  }
}
