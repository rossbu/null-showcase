package com.showcase.nullability.spring.util;

import org.springframework.lang.Nullable;

public class CommonUtils {


  public static void main(String[] args) {
    User user = getUser();
    System.out.println(user.getEmail());
    System.out.println(user.getName());
    System.out.println(user);
    user.setName(null); // check warning due to nullability check by @NonNullAPi
    user.setEmail(null);  // try to remove the @Nullable and here you will get the warning.
  }

  public static User getUser() {
    return null;    // check the warning due to nullability check by @NonNullAPi
  }


  // Declare a User class
  public static class User {

    private String name;
    private String email;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Nullable   // since package is for non-nullable, so we need to add @Nullable annotation if needed
    public String getEmail() {
      return email;
    }

    public void setEmail(@Nullable String email) {
      this.email = email;
    }
  }
}
