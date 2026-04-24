package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subitraiDoisNumeros(12, 10);
        calculadora.separaDoisNumeros();
        calculadora.multiplicandoDoisNumeros(12, 32.3f);
        calculadora.nome = "Nunes";
        System.out.println(calculadora.nome);
        calculadora.testeIfs(13, 10);
    }
}
