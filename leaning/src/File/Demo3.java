package File;

import java.io.File;

public class Demo3 {
  public static void main(String[] args) {
    File srcFolder = new File("/Users/eric/Desktop/code/java");
    getAllFiles(srcFolder);
  }

  public static void getAllFiles(File file) {
    File[] filesArray = file.listFiles();
    for (File file1 : filesArray) {
      if (file1.isDirectory()) {
        getAllFiles(file1);
      } else {
        if (file1.getName().endsWith(".java")) {
          System.out.println(file.getName());
        }
      }
    }
  }
}
