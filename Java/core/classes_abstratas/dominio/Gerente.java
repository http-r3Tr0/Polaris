package Polaris.Java.core.classes_abstratas.dominio;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
//    @Override
//    public void imprimir(){
//        System.out.println("salario: "+this.salario);
//    }

    @Override
    public void calcularBonus(){
        this.salario = this.salario+ this.salario*0.05;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
