package Polaris.Java.core.Polimorfismo.test;

import Polaris.Java.core.Polimorfismo.dominio.Computador;
import Polaris.Java.core.Polimorfismo.dominio.Televisao;
import Polaris.Java.core.Polimorfismo.dominio.Tomate;
import Polaris.Java.core.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args){
        Computador computador = new Computador("Theseu", 3750);
        Tomate tomate = new Tomate("tomate feira", 5);
        Televisao tv = new Televisao("Samsung 50\"", 2500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
