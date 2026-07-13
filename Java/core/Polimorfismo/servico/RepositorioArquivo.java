package Polaris.Java.core.Polimorfismo.servico;

import Polaris.Java.core.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando arquivo...");
    }
}
