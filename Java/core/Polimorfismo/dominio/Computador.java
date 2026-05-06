package Polaris.Java.core.Polimorfismo.dominio;

public class Computador extends Produto{
    public final double IMPOSTO_PORCENTO = 0.21;

    public Computador(String nome, double valor){
        super(nome,valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
