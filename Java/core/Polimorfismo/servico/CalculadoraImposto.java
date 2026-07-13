package Polaris.Java.core.Polimorfismo.servico;

import Polaris.Java.core.Polimorfismo.dominio.Computador;
import Polaris.Java.core.Polimorfismo.dominio.Produto;
import Polaris.Java.core.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Relatorio");
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor: R$"+produto.getValor());
        System.out.println("Imposto: R$"+imposto);
        if (produto instanceof Tomate) {
            System.out.println("Data de validade: " + ((Tomate) produto).getDataValidade());
        }
    }
}
