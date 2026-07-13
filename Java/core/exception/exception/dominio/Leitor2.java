package Polaris.Java.core.exception.exception.dominio;

import java.io.Closeable;

public class Leitor2 implements Closeable {
    @Override
    public void close() {
        System.out.println("Fechando leitor 2");
    }
}
