package br.com.dvsilva.aula14;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Singular;
import lombok.Synchronized;
import lombok.ToString;
import lombok.With;
import lombok.experimental.NonFinal;

import java.util.List;

@Builder
//@Builder(builderClassName = "HelloWorldBuilder",
//        buildMethodName = "execute",
//        builderMethodName = "helloWorld",
//        toBuilder = true,
//        access = AccessLevel.PUBLIC,
//        setterPrefix = "set"
//)

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
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Aluno {
//    private final Object readLock = new Object();

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

    @Builder.Default
    @With
    @ToString.Include
//    @Getter(AccessLevel.PUBLIC)
//    @Setter(AccessLevel.PACKAGE)
    private boolean ativo = Boolean.FALSE;

    @Singular(value = "addInteresse")
    @With
    @ToString.Include
    private List<String> interesses;

    public String getNome(){
        return "nome formatado " + nome;
    }

    @Synchronized //("readLock")
    public void helloWorld() {
        System.out.println("world");
    }
}
