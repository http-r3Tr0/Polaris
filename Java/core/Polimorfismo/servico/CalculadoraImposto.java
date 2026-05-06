package Polaris.Java.core.Polimorfismo.servico;

import Polaris.Java.core.Polimorfismo.dominio.Computador;
import Polaris.Java.core.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculadoraImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: "+computador.getNome());
        System.out.println("Valor: R$"+computador.getValor());
        System.out.println("Imposto: R$"+imposto);
    }
    public static void calculadoraImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador: "+tomate.getNome());
        System.out.println("Valor: R$"+tomate.getValor());
        System.out.println("Imposto: R$"+imposto);
    }
}
