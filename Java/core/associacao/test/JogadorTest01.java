package Java.core.associacao.test;

import Java.core.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args){
        Jogador jogador3 = new Jogador("Neymar");
        Jogador jogador1 = new Jogador("Jorginho");
        Jogador jogador2 = new  Jogador("Vini junior");

        Jogador[] jogadores = new Jogador[]{jogador3, jogador1, jogador2};

        for (Jogador jogador : jogadores) {
            jogador.imprimir();
        }
    }
}
