package Polaris.Java.core.exception.exception.test;

import Polaris.Java.core.exception.exception.dominio.Funcionario;
import Polaris.Java.core.exception.exception.dominio.LoginInvalidoException;
import Polaris.Java.core.exception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
}
