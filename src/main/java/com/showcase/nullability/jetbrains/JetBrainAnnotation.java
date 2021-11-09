package com.showcase.nullability.jetbrains;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
  https://www.jetbrains.com/help/idea/nullable-and-notnull-annotations.html
  The @Nullable and @NotNull annotations are used to indicate the IDE that something (argument, attribute, etc.) can (or cannot) be null.

  @Nullable and @NotNull

  Use @Nullable just to declare that your variable or method can hold a null value.
  Use @NotNull is to tell that
    3. A method should not accept null as a parameter
    4. A field should not hold a null value
    5. A method should not accept null as a return value

 */
public class JetBrainAnnotation {
  @NotNull
  String firstName = "john";

  @Nullable
  String nickName = "jj";

  public static void main(String[] args) {

    JetBrainAnnotation jbs = new JetBrainAnnotation();

    passParamToNotNullArg(null, "test");

    // return value should not be null
    System.out.println(returnNotNull());

    // return value may be null
    System.out.println(returnNullable());

    // set firstName as nll
    jbs.setFirstName(null);

    // set nickName as null
    jbs.setNickName(null);

  }

  public static void passParamToNotNullArg(@Nullable String str, @NotNull String str2) {
    System.out.println(str + str2); // now that str is nullable, need to use NPE check
  }

  @NotNull
  public static  String returnNotNull() {
    return null;
  }

  @Nullable
  public static String returnNullable() {
    return null;
  }

  public void setFirstName(@NotNull String firstName) {
    this.firstName = firstName;
  }

  public void setNickName(@Nullable String nickName) {
    this.nickName = nickName;
  }
}
