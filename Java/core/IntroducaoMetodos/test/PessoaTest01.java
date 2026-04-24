package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args){
        Pessoa pessoa01 = new Pessoa();
//        pessoa01.nome = "nunes";
//        pessoa01.idade = 21;
        pessoa01.setNome("nunes");
        pessoa01.setIdade(21);
//        pessoa01.imprime();
        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());
    }
}
