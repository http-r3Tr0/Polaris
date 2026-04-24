package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Estudante;
import Java.core.IntroducaoMetodos.dominio.impressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        impressoraEstudante imprima = new impressoraEstudante();

        estudante.nome = "nunes";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println("----------------");

        estudante2.nome = "Skar";
        estudante2.idade = 200;
        estudante2.sexo = 'M';

        imprima.imprime(estudante);
        imprima.imprime(estudante2);
    }
}
