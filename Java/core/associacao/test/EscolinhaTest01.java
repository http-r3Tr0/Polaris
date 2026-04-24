package Java.core.associacao.test;

import Java.core.associacao.dominio.Escola;
import Java.core.associacao.dominio.Professor;

public class EscolinhaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("jiraya");
        Professor professor2 = new Professor("Kakashi");
        // criamos os professores
        Professor[] professores = {professor1, professor2};
        // fizemos um array de professores e colocamos os objetos lá
        Escola escola = new Escola("Yale", professores);
        // construimos o objeto escola e colocamos o nome de yale e os professores
        escola.imprimir();

    }
}
