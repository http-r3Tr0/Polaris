package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("nunes");
        funcionario.setIdade(21);
        funcionario.setSalarios(new int[]{1200, 2599, 5000});
        funcionario.mediaSalarios();
        funcionario.imprimirFuncionario();

    }
}