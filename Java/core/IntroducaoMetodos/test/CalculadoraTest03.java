package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);//dá para fazer assim, declarando uma array
        calculadora.somaArray(new int[]{1,2,3,4});// ou assim, criado ela direto
        calculadora.somaVararg(2,4,5,6,7,8);
    }
}
