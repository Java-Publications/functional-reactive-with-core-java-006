package org.rapidpm.frp.v005;

import static org.rapidpm.frp.matcher.Case.match;
import static org.rapidpm.frp.matcher.Case.matchCase;
import static org.rapidpm.frp.model.Result.success;

import java.util.function.Function;

import org.rapidpm.frp.model.Pair;
import org.rapidpm.frp.model.Result;

/**
 *
 */
public class Main {

  public static void main(String[] args) {

    Integer x = 1;

    Result<Pair<Integer, Function<Integer, Integer>>> result =
        match(
            matchCase(() -> success(new Pair<>(x , (v) -> v + 1))) ,
            matchCase(() -> x == 1 , () -> success(new Pair<>(x , (v) -> v + 1))) ,
            matchCase(() -> x == 2 , () -> success(new Pair<>(x , (v) -> v + 2))) ,
            matchCase(() -> x > 2 , () -> success(new Pair<>(x , (v) -> v + 3))) ,
            matchCase(() -> x < - 2 , () -> success(new Pair<>(x , (v) -> v + 4))) ,
            matchCase(() -> false , () -> Result.failure("error message"))
        );
    result.ifPresentOrElse(
        sucess -> { System.out.println("sucess = " + sucess);} ,
        failed -> { System.out.println("failed = " + failed);}
    );


  }
}
