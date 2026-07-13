package Polaris.Java.core.Polimorfismo.test;

import Polaris.Java.core.Polimorfismo.repositorio.Repositorio;
import Polaris.Java.core.Polimorfismo.servico.RepositorioArquivo;
import Polaris.Java.core.Polimorfismo.servico.RepositorioBancoDeDados;
import Polaris.Java.core.Polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest01 {
    static void main() {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
    }
}
