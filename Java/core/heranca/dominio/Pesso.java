package Java.core.heranca.dominio;

public class Pesso {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
static {
    System.out.println("Dentro do bloco de inicialização estatico pessoa");
}

    {
        System.out.println("Dentro do bloco de inicialização não estatico  pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico  pessoa 2");
    }
    public Pesso(String nome){
        System.out.println("Dentro do contrutor pesso");
        this.nome = nome;
    }

    public Pesso(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" "+ this.getEndereco().getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
