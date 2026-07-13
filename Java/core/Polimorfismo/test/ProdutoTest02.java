package Polaris.Java.core.Polimorfismo.test;

import Polaris.Java.core.Polimorfismo.dominio.Computador;
import Polaris.Java.core.Polimorfismo.dominio.Produto;
import Polaris.Java.core.Polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main() {
        Produto produto = new Computador("ryzen 6", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-----------------");

        Produto produto2 = new Tomate("siciliano", 12);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println();
    }
}
