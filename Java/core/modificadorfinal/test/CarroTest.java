package Java.core.modificadorfinal.test;

import Java.core.modificadorfinal.dominio.Carro;
import Java.core.modificadorfinal.dominio.Comprador;
import Java.core.modificadorfinal.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args){
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        Comprador comprador2 = new Comprador();
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("carlos");
        System.out.println(carro.COMPRADOR);
        carro.imprimir();

        Ferrari carro1 = new Ferrari();
        carro1.setNome("enzo ferrari");
        carro1.imprimir();
    }
}
