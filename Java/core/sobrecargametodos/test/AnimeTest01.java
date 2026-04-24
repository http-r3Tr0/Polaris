package Java.core.sobrecargametodos.test;

import Java.core.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args){
        Anime anime = new Anime();
        anime.init("Boku no hero","TV", 36,"shounen");
        anime.imprimir();
    }
}
