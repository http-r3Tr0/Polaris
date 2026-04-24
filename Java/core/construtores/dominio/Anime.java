package Java.core.construtores.dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String tipo;
    private String genero;
    private String studio;

    public Anime(String nome, int episodios, String tipo, String genero){
        System.out.println("dentro do construtor");
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos!!");
    }

    public Anime(String nome, int episodios, String tipo, String genero, String studio){
        this(); // serve para chamar o construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.studio = studio;
    }
    public void imprimir (){
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

//
//  public void init(String nome, int episodios){
//      this.nome = nome;
//      this.episodios = episodios;
//  }
//
//  public void init(String nome, int episodios, String tipo, String genero){
//      this.nome = nome;
//      this.tipo = tipo;
//      this.episodios = episodios;
//      this.genero = genero;
//  }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
