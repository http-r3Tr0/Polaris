package Polaris.Java.core.heranca.test;

import Polaris.Java.core.heranca.dominio.Endereco;
import Polaris.Java.core.heranca.dominio.Funcionario;
import Polaris.Java.core.heranca.dominio.Pesso;

public class HerancaTest03 {
    public static void main() {
        Endereco endereco = new Endereco();
        endereco.setRua("rua pitanga");
        endereco.setCep("1241-123");
        
        Pesso pessoa = new Pesso("asl", "açlsdkfj 112");
        pessoa.setEndereco(endereco);
        pessoa.imprimir();

        Funcionario funcionario1 = new Funcionario("Cleber");
        funcionario1.setSalario(5000);
        funcionario1.setCpf("12098 2-3049");
        funcionario1.setEndereco(endereco);
        funcionario1.imprimir();
        funcionario1.gerarRelatorio();
    }
}
