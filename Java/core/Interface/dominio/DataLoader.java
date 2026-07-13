package Polaris.Java.core.Interface.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;

    void loader();
    default void checkPermission(){
        System.out.println("fazendo checagem de permissões");
    }
    public static void retriveMaxDataSize(){
        System.out.println("dentro do retriveMaxDataSize da interface");
        System.out.println(MAX_DATA_SIZE);
    }
}
