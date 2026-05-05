package Polaris.Java.core.associacao.test;

import Polaris.Java.core.associacao.dominio.Escola;
import Polaris.Java.core.associacao.dominio.Professor;
import Polaris.Java.core.associacao.exercicio.dominio.Professores;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor = new Professor("Claude");
        Professor professor1 = new Professor("Gemini");

        Escola escola = new Escola("Valdivino");
        escola.setProfessores(new Professor[] {professor, professor1});
        escola.imprimir();




    }
}
