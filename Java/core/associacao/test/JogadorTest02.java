package Java.core.associacao.test;

import Java.core.associacao.dominio.Jogador;
import Java.core.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args){
        Jogador jogador = new Jogador("Neymar");
        Time time = new Time("Santos");
        jogador.setTime(time);
        jogador.imprimir();
    }
}
