package Java.core.enumeracao.test;

import Java.core.enumeracao.dominio.Cliente;
import Java.core.enumeracao.dominio.TipoCliente;
import Java.core.enumeracao.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args){
        Cliente cliente01 = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente02 = new Cliente("Inuyasha", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente01);
        System.out.println(cliente02);

        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
