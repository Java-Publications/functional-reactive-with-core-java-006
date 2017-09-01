package org.rapidpm.frp.v004;

import org.rapidpm.frp.matcher.Case;
import org.rapidpm.frp.model.Result;

/**
 *
 */
public class Main {

  public static void main(String[] args) {

    Integer x = 1;

    Result<String> result = Case
        .match(
            Case.matchCase(() -> Result.success("OK")) ,
            Case.matchCase(() -> x == 1 , () -> Result.success("Result 1")) ,
            Case.matchCase(() -> x == 2 , () -> Result.success("Result 2")) ,
            Case.matchCase(() -> x > 2 , () -> Result.success("Result 2")) ,
            Case.matchCase(() -> x < -2 , () -> Result.success("Result 2")) ,
            Case.matchCase(() -> false , () -> Result.failure("error message"))
        );
    result.ifPresentOrElse(
        sucess -> { System.out.println("sucess = " + sucess);} ,
        failed -> { System.out.println("failed = " + failed);}
    );
  }
}
