package Java.core.blocosincializacao.test;

import Java.core.blocosincializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        for (int episodio: anime.getEpisodios()){
            System.out.print(episodio+" ");
        }
    }
}
