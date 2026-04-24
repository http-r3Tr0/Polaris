package Java.core.heranca.dominio;

public class Funcionario extends Pesso {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico funcionario 2");
    }

    public Funcionario(String nome){
    super(nome);
        System.out.println("dentro do construtor funcionario");
    }

    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);
    }

    public void gerarRelatorio(){
        System.out.println("Eu "+ this.nome +" Confirmo que recebi meu salario no valor: R$"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
