package br.com.dvsilva.aula12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.With;
import lombok.experimental.NonFinal;

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

    public String getNome(){
        return "nome formatado " + nome;
    }

}
