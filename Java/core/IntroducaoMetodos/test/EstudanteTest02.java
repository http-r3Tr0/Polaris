package Java.core.IntroducaoMetodos.test;

import Java.core.IntroducaoMetodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante.nome = "JErso";
        estudante.idade = 21;
        estudante.sexo = 'M';

        estudante02.nome = "Edward Fullmetal";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        estudante.imprime();
        estudante02.imprime();

    }
}
