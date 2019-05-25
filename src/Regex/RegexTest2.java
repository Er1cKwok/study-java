package Regex;

public class RegexTest2 {
  public static void main(String[] args) {
    String str = "123 32 44 221 23";
    String[] strArr = str.split(" ");
    int[] arr = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
      arr[i] = Integer.parseInt(strArr[i]);
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]).append(" ");
    }
    sb.toString().trim();
    System.out.println(sb);
  }
}
