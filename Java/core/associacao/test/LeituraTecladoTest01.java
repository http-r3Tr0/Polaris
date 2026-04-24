package Java.core.associacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args){
        System.out.println("o grande software irá lhe responder");
        System.out.print("Digite sua pergunta e eu responderei sim ou não: ");
        Scanner input = new Scanner(System.in);
        String Pergunta = input.nextLine();
if (Pergunta.charAt(0) == ' '){ //o charAt vai verificar se a primeira posicção é vazio se for vai dar sim
    System.out.println("sim");
} else {
    System.out.println("não");
}
    }
}
