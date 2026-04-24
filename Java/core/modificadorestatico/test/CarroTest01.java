package Java.core.modificadorestatico.test;
import Java.core.modificadorestatico.domain.Carro;
public class CarroTest01 {
    public static void main(String[] args){
Carro.setVelocidadeLimite(190);
        Carro c1 = new Carro("Bmw", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);
   c1.imprimir();
   c2.imprimir();
   c3.imprimir();






    }
}
