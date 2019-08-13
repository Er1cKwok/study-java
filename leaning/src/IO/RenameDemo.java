package IO;

import java.io.*;

public class RenameDemo {
  public static void main(String[] args) throws IOException{
    File srcFolder = new File("abc");
    File destFolder = new File("aaa");

    if (!destFolder.exists()) {
      destFolder.mkdir();
    }

    File[] files = srcFolder.listFiles(new FilenameFilter() {
      @Override
      public boolean accept(File dir, String name) {
        return new File(dir, name).isFile() && name.endsWith(".java");
      }
    });

    for (File file : files) {
      String name = file.getName();
      File newFile = new File(destFolder, name);

      copyFile(file, newFile);
    }

    File[] newFolders = destFolder.listFiles();
    for (File file : newFolders) {
      String name = file.getName();
      String newName = name.replace(".java", ".jad");
      File newFile = new File(destFolder, newName);
      file.renameTo(newFile);
    }

  }

  public static void copyFile(File file, File newFile) throws IOException {
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

    byte[] chs = new byte[1024];
    int len;
    while ((len = bis.read(chs)) != -1) {
      bos.write(chs, 0, len);
    }

    bis.close();
    bos.close();
  }
}
