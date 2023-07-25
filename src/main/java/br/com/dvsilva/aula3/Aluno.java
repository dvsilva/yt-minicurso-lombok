package br.com.dvsilva.aula3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno {

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private String nome;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private int idade;

}
