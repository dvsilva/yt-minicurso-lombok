package br.com.dvsilva.aula17;

import br.com.dvsilva.aula16.UtilityClassExample;
import lombok.Cleanup;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static java.util.Collections.emptyList;

public class Aula17 {

    public static void main(String[] args) {
        lerEEscreverArquivo();

        Aluno aluno = new Aluno(
                "novo aluno", 1.0, 'm',
                19, true, emptyList(), 0
        );
        aluno = aluno.withNome("xxx");
//        aluno.setNome("novo aluno");
//        aluno.setNota(8.5);
//        aluno.setSexo('M');
//        aluno.setIdade(18);
//        aluno.setAtivo(Boolean.TRUE);

        System.out.println(aluno.getNome() + " - " +
                aluno.getIdade());
        System.out.println(aluno.toString());


        Aluno aluno2 = new Aluno(
                "novo aluno 2", 1.0, 'm', 19,
                true, emptyList(), 0
        );
//        aluno.setNome("novo aluno 2");
//        aluno.setNota(8.0);
//        aluno.setSexo('M');
//        aluno.setIdade(12);
//        aluno.setAtivo(Boolean.TRUE);

//        aluno2.setNome("novo aluno");
//        aluno2.setNota(8.5);
//        aluno2.setSexo('M');
//        aluno2.setIdade(18);
//        aluno2.setAtivo(Boolean.TRUE);

        System.out.println(aluno.equals(aluno2));
        System.out.println(aluno == aluno2);

        Aluno alunoWith = new Aluno()
                .withNome("nome")
                .withIdade(20)
                .withNota(4.2)
                .withSexo('M')
                .withInteresses(emptyList())
                .withAtivo(true);

        alunoWith = alunoWith.withNome("novo nome de aluno");

        System.out.println(alunoWith);

//        Aluno alunoBuilder = Aluno.helloWorld()
//                .setNome("aluno builder")
//                .setIdade(20)
//                .setNota(4.2)
//                .setSexo('M')
//                .execute();

        Aluno alunoBuilder = Aluno.builder()
                .nome("aluno builder")
                .idade(20)
                .nota(4.2)
                .sexo('M')
                .addInteresse("Xadrez")
                .addInteresse("Dominó")
//                .interesses(new ArrayList<>())
//                .ativo(true)
                .build();

//        alunoBuilder.getInteresses().add("Futebol");
        System.out.println(alunoBuilder);

//        da erro por causa do construtor privado criado pela @UtilityClass
//        UtilityClassExample uc = new UtilityClassExample();

        System.out.println(
                UtilityClassExample
                        .sayHelloForAluno(aluno2.getNome())
        );

        System.out.println(UtilityClassExample.hoje());

        aluno = aluno.media(4.5);
        System.out.println(aluno);
    }

    @SneakyThrows(value = {
            FileNotFoundException.class,
            IOException.class
    })
    private static void lerEEscreverArquivo() {
        @Cleanup InputStream in = new FileInputStream(
                "src//main//resources//arquivo.txt");
        @Cleanup OutputStream out = new FileOutputStream(
                "src//main//resources//resultado.txt");

        byte[] b = new byte[10000];

        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }

//        in.close();
//        out.close();
    }

}
