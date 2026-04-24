package Java.core.associacao.test;

import Java.core.associacao.dominio.Escola;
import Java.core.associacao.dominio.Professor;
import Java.core.associacao.exercicio.dominio.Professores;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor = new Professor("Claude");
        Professor professor1 = new Professor("Gemini");

        Escola escola = new Escola("Valdivino");
        escola.setProfessores(new Professor[] {professor, professor1});
        escola.imprimir();




    }
}
