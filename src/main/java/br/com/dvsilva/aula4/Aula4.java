package br.com.dvsilva.aula4;

public class Aula4 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("novo aluno");
        aluno.setNota(8.5);
        aluno.setSexo('M');
        aluno.setIdade(18);
        aluno.setAtivo(Boolean.TRUE);

        System.out.println(aluno.getNome() + " - " +
                aluno.getIdade());
        System.out.println(aluno.toString());


    }

}
