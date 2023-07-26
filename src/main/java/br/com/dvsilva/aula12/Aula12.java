package br.com.dvsilva.aula12;

import lombok.Cleanup;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aula12 {

    public static void main(String[] args) throws IOException {
        lerEEscreverArquivo();

        Aluno aluno = new Aluno(
                "novo aluno", 1.0, 'm',
                19, true
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
                true
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
//                .ativo(true)
                .build();

        System.out.println(alunoBuilder);
    }

    private static void lerEEscreverArquivo() throws IOException {
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
