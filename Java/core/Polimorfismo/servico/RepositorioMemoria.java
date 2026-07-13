package Polaris.Java.core.Polimorfismo.servico;

import Polaris.Java.core.Polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar(){
        System.out.println("Salvando em memoria...");
    }
}
