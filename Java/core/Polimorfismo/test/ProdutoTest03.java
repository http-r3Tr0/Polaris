package Polaris.Java.core.Polimorfismo.test;

import Polaris.Java.core.Polimorfismo.dominio.Computador;
import Polaris.Java.core.Polimorfismo.dominio.Produto;
import Polaris.Java.core.Polimorfismo.dominio.Tomate;
import Polaris.Java.core.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main() {
        Produto produto = new Computador("ryzen 6", 3000);

        System.out.println("-----------------");

        Tomate tomate = new Tomate("Tomate siciliano", 12);
        tomate.setDataValidade("15/05/2026");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);

    }
}
