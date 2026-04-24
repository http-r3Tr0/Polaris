
package Java.core.test;

import Java.core.dominio.Carro;

public class ExClasses {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.ano_producao = 2000;
        carro.modelo = "Toyota";
        carro.nome = "cherry";

        carro1.ano_producao = 1950;
        carro1.modelo = "911";
        carro1.nome = "Porsche";

        System.out.println("Nome: "+carro.nome+"\nModelo:  "+carro.modelo+"\nAno de produção: "+carro.ano_producao);
        System.out.println("Nome: "+carro1.nome+"\nModelo:  "+carro1.modelo+"\nAno de produção: "+carro1.ano_producao);
    }
}
