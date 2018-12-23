 /**
 * @author Bob
 * <b>Summary</b>
 */
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
   * @param someone; no se sabe que es
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
