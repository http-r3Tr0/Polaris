package Java.core.associacao.exercicio.dominio;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminarios seminario;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (seminario == null) return;
        System.out.println(seminario.getTitulo());
    }


    public Estudantes(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Estudantes(String nome, int idade, Seminarios seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
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

    public Seminarios getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminarios seminario) {
        this.seminario = seminario;
    }
}
