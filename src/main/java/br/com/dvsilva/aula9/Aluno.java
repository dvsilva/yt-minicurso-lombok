package br.com.dvsilva.aula9;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import lombok.experimental.NonFinal;

//@Value
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

    @NonFinal
    @With
    @NonNull
//    @EqualsAndHashCode.Include
    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private String nome;

//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)

    @With
    private Double nota;

//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)

    @With
    private char sexo;

    @With
    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private int idade;

    @With
    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private boolean ativo;

    public Aluno(){}

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
