package RegistLogin.impl;

import RegistLogin.RegistAndLogin;
import User.User;
import java.io.*;

public class RegistAndLoginImp implements RegistAndLogin {
  private static File file = new File("login.txt");

  public boolean login(String username, String password) {
    boolean flag = false;
    String line = null;
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(file));
      while ((line = br.readLine()) != null) {
        String[] ss = line.split("=");
        if (username.equals(ss[0]) && password.equals(ss[1])) {
          flag = true;
          break;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("找不到文件");
    } catch (IOException e) {
      System.out.println("登录失败");
    } finally {
      try {
        if (br != null) {
          br.close();
        } else {
          System.out.println("登录失败");
        }
      } catch (IOException e) {
        System.out.println("登录释放资源失败");
      }
    }
    return flag;
  }

  public void regist(User user) {
    BufferedWriter bw = null;
    try {
      bw = new BufferedWriter(new FileWriter(file));
      bw.write(user.getUsername() + "=" + user.getPassword());
      bw.flush();
    } catch (IOException e) {
      System.out.println("注册异常");
    } finally {
      if (bw != null) {
        try {
          bw.close();
        } catch (IOException e) {
          System.out.println("注册释放资源失败");
        }
      }
    }
  }
}
