package br.com.dvsilva.aula6;

public class Aula6 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(
                "novo aluno", 1.0, 'm',
                19, true
        );
//        aluno.setNome("novo aluno");
//        aluno.setNota(8.5);
//        aluno.setSexo('M');
//        aluno.setIdade(18);
//        aluno.setAtivo(Boolean.TRUE);

        System.out.println(aluno.getNome() + " - " +
                aluno.getIdade());
        System.out.println(aluno.toString());


        Aluno aluno2 = new Aluno(
                null, 1.0, 'm', 19,
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
    }

}
