package org.rapidpm.frp.v001;

import java.util.function.Consumer;

/**
 *
 */
public class Main {

  private static Consumer<String> print = System.out::println;

  public static void main(String[] args) {

    String value = "";
    if (value.equals("a")) {print.accept(value);} else {print.accept(value);}

    if (value.equals("a")) print.accept(value); else print.accept(value);

    if (value.equals("a")) print.accept(value) ;
    else if (value.equals("a")) print.accept(value);
    else if (value.equals("a")) print.accept(value);


  }


}
