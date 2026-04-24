package Java.core.IntroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private int[] salarios = new int[3];
    private double media = 0;

    public void imprimirFuncionario(){
        System.out.println("============");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salarios[2]);
    }
    public void mediaSalarios(){
        int median = (salarios[0] + salarios[1] + salarios[2]) / 3;
        System.out.println("a média salarial é: R$"+median);
    }

    public int[] getSalarios() {
        return salarios;
    }

    public void setSalarios(int[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
