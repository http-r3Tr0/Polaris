package Polaris.Java.core.Strings.test;

public class StringTest01 {
    public static void main(String[] args){
        String nome = "nunes";//iguais
        String nome2 = "nunes";
        String nome3 = new String("nunes");//igual tambem mas ficou pra fora do pool

        System.out.println( nome == nome2);
        nome = nome.concat(" e chapisco");
        System.out.println(nome);
        System.out.println( nome == nome2);
        System.out.println(nome.charAt(0));//vai devolver a letra que estiver nessa posição
        System.out.println(nome3.length());
        System.out.println(nome2==nome3.intern());

    }
}
