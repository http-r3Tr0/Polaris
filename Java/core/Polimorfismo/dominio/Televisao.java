package Polaris.Java.core.Polimorfismo.dominio;

public class Televisao extends Produto{
    public final double IMPOSTO_PORCENTO = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
