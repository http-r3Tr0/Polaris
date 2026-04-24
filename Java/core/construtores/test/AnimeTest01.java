package Java.core.construtores.test;
import Java.core.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
    Anime anime = new Anime("inuyasha", 36, "TV", "shounen", "ghibli" );
    Anime anime1 = new Anime();
        //anime.init("Death note", 36, "TV", "shounen" );

    anime.imprimir();
    }
}
