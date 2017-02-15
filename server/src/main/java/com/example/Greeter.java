package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * Some comments.
  * @param someone someone info
  */
  public String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
