package br.com.dvsilva.aula3;

public class Aula3 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setIdade(18);
        aluno.setNome("novo aluno");

        System.out.println(aluno.getNome() + " - " +
                aluno.getIdade());



    }

}
