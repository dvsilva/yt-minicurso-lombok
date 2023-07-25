package br.com.dvsilva.aula4;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(
        includeFieldNames = true,
//        exclude = {"sexo", "nota"},
//        of = {"idade", "nome", "ativo"},
//        callSuper = true,
        doNotUseGetters = false,
        onlyExplicitlyIncluded = true
)
@Getter
@Setter
public class Aluno {

    @ToString.Include
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private String nome;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private Double nota;

    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private char sexo;

    @ToString.Include
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private int idade;

    @ToString.Include
    @Getter(AccessLevel.PUBLIC)
    @Setter(AccessLevel.PACKAGE)
    private boolean ativo;

    public String getNome(){
        return "nome formatado " + nome;
    }

}
