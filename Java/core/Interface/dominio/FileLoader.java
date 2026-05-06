package Polaris.Java.core.Interface.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void loader(){
        System.out.println("Carregando dados de um arquivo...");
    }
    @Override
    public void remove(){
        System.out.println("Removendo dados de um arquivo...");
    }
    @Override
    public void checkPermission(){
        System.out.println("checando permissões no arquivo");
    }
}
