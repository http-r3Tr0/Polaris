package Java.core.associacao.test;

import Java.core.associacao.dominio.Jogador;
import Java.core.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Endrick");
        Jogador jogador2 = new Jogador("Vini jr");
        Jogador jogador3 = new Jogador("paquetá");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Brasil");

        jogador1.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador1.imprimir();

        System.out.println("--- Time ---");
        time.imprimir();
    }
}
