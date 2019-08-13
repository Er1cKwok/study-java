package File;

import java.io.File;

public class Demo2 {
  public static void main(String[] args) {
    File file = new File("/Users/eric/Desktop/");
//    String[] strings = file.list();
//    for (String s : strings) {
//      System.out.println(s);
//    }
    File[] files = file.listFiles();
    for (File f : files) {
      if (f.isFile()) {
        if (f.getName().endsWith(".mp4")){
          System.out.println(f.getName());
        }
      }
    }
  }
}
