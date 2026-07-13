package Polaris.Java.core.exception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args){
        escrevendoArquivo2();
    }

    private static String escrevendoArquivo() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            return "Conexão aberta";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
    private static void escrevendoArquivo2() {
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
