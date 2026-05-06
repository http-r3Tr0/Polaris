package Polaris.Java.core.Polimorfismo.dominio;

public class Tomate extends Produto{
    public final double IMPOSTO_PORCENTO = 0.06;
    public Tomate(String nome, int valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do tomate");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
