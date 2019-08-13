package RegistLogin;

import User.User;

public interface RegistAndLogin {
  public abstract void regist(User user);
  public abstract boolean login(String username, String password);
}
