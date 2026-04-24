package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

//        double result = calculadora.divideDoisNumeros(12, 2);
//        System.out.println(result);
//        System.out.println(calculadora.divideDoisNumeros(12, 2));
//
        int num1 = 2;
        int num2 = 3;
        calculadora.mudaNumero(num1, num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
