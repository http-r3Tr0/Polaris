package Java.core.classes_abstratas.test;

import Java.core.classes_abstratas.dominio.Desenvolvedor;
import Java.core.classes_abstratas.dominio.Funcionario;
import Java.core.classes_abstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Gerente gerente = new Gerente("jiraya",8000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("nunes", 12000);
        System.out.println(desenvolvedor);

    }
}
