package Java.core.enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
// method para buscar o número e me responder o que seria
    public static TipoCliente relatorioNome(String nomeRelatorio){
        for (TipoCliente tipoClient: values()){ //for each loop pois o values vai criar um array
            if (tipoClient.getNomeRelatorio().equals(nomeRelatorio)){ // if para verificar se o nome que recebemos é igual
                return tipoClient; // se for, manda
            }
        } return null; // caso não achar nada, nulo
    }


    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}

