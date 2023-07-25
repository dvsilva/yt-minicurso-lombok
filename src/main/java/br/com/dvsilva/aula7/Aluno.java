package br.com.dvsilva.aula7;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Data
//@EqualsAndHashCode(
////    exclude = {"nota"}
//    onlyExplicitlyIncluded = true
//)
@ToString(
        includeFieldNames = true,
//        exclude = {"sexo", "nota"},
//        of = {"idade", "nome", "ativo"},
//        callSuper = true,
        doNotUseGetters = false,
        onlyExplicitlyIncluded = true
)
//@Getter
//@Setter
public class Aluno {

    @NonNull
//    @EqualsAndHashCode.Include
    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private String nome;

//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private Double nota;

//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private char sexo;

    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private int idade;

    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private boolean ativo;

    public Aluno(@NonNull String nome, Double nota, char sexo, int idade, boolean ativo) {
        this.nome = nome;
        this.nota = nota;
        this.sexo = sexo;
        this.idade = idade;
        this.ativo = ativo;
    }

    public String getNome(){
        return "nome formatado " + nome;
    }

}
