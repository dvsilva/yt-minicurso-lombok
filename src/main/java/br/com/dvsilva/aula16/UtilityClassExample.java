package br.com.dvsilva.aula16;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;

@UtilityClass
public class UtilityClassExample {
  private static final String CONSTANT = "Hello, ";

  public static String sayHelloForAluno(String nomeAluno) {
    return CONSTANT + nomeAluno;
  }

  public static LocalDateTime hoje(){
    return LocalDateTime.now();
  }

}