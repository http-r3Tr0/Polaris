package Java.core.modificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
     static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i +1;
            // vai imprimir a mensagem e colocar 100 numero dentro da lista de episodios
        }
    }
    // vai imprimir a lista de episodios para cada objeto que criamos
    public Anime(){
        for (int episodios: Anime.episodios){
        System.out.print(episodios + " ");
    }
            System.out.println();
        }
        public Anime(String nome){
        this.nome = nome;
        }
        public String getNome(){
        return this.nome;
        }
        public int[] getEpisodios(){
        return this.episodios;
        }
}
