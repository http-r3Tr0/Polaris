package Java.core.heranca.test;

import Java.core.heranca.dominio.Endereco;
import Java.core.heranca.dominio.Funcionario;
import Java.core.heranca.dominio.Pesso;

public class HerancaTest01 {
    public static void main(String[] args){
        Endereco endereco = new Endereco();
        endereco.setCep("Pitangas");
        endereco.setRua("Rua dos laranjais");
        Pesso pessoa = new Pesso("Tony stark");



        pessoa.setCpf("56168115-123");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Nunes");
        funcionario.setCpf("12345678-90");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprimir();
        funcionario.gerarRelatorio();

    }
}
