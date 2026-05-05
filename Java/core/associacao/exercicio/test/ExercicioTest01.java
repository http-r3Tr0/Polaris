package Polaris.Java.core.associacao.exercicio.test;

import Polaris.Java.core.associacao.exercicio.dominio.Estudantes;
import Polaris.Java.core.associacao.exercicio.dominio.Local;
import Polaris.Java.core.associacao.exercicio.dominio.Professores;
import Polaris.Java.core.associacao.exercicio.dominio.Seminarios;
import Polaris.dominio.Estudante;

public class ExercicioTest01 {
    public static void main(String[] args){
        Estudantes estudante1 = new Estudantes("Judas", 20);
        Estudantes estudante2 = new Estudantes("Marcos", 25);
        Professores professor1 = new Professores("Jorge", "Cronicas");

        Estudantes[] estudantes = {estudante1, estudante2};

        Local local1 = new Local("Sala 01");
        Seminarios seminario2 = new Seminarios("Micro-Pênis: mito ou verdade?", estudantes, local1);

        Seminarios[] seminarios = {seminario2};
        professor1.setSeminariosMinistrados(seminarios);
professor1.imprimir();
    }
}
