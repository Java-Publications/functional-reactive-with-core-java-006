package org.rapidpm.frp.v002;

/**
 *
 */
public class Main {

  public static void main(String[] args) {

    String x = null;

    String valueA = (x == null) ? "" : x ;

    String valueB = (x == null) ? "" : (x.equals("a") ? "A" : "xx");

    String valueC = (x == null) ? ""
                                : (x.equals("a")) ? "A"
                                : (x.equals("b")) ? "B"
                                : "xx";

  }
}
