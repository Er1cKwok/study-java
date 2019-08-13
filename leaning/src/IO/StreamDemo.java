package IO;

import java.io.*;

public class StreamDemo {
  public static void main(String[] args) throws IOException {
    File src = new File("1.jpg");
    File aid = new File("5.jpg");
//    method1(src, aid);
//    method2(src, aid);
//    method3(src, aid);
    method4(src, aid);
  }

  private static void method4(File src, File aid) throws IOException {
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(aid));
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

    byte[] bys = new byte[1024];
    int len;
    while ((len = bis.read(bys)) != -1) {
      bos.write(bys, 0, len);
    }

    bis.close();
    bos.close();
  }

  private static void method3(File src, File aid) throws IOException {
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(aid));

    int by;
    while ((by = bis.read()) != -1) {
      bos.write(by);
    }

    bis.close();
    bos.close();
  }

  private static void method2(File in, File out) throws IOException {
    FileInputStream fis = new FileInputStream(in);
    FileOutputStream fos = new FileOutputStream(out);

    byte[] bys = new byte[1024];
    int len;
    while ((len = fis.read(bys)) != -1) {
      fos.write(bys, 0, len);
    }

    fis.close();
    fos.close();
  }

  public static void method1(File in, File out) throws IOException {
    FileInputStream fis = new FileInputStream(in);
    FileOutputStream fos = new FileOutputStream(out);

    int by;
    while ((by = fis.read()) != -1) {
      fos.write(by);
    }

    fis.close();
    fos.close();
  }
}
