package Polaris.Java.core.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
    criarTexto();
    }
    private static void criarTexto(){
        File file = new File("/home/fernandonunes/IdeaProjects/Polaris/src/Polaris/Java/core/exception/exception/test/arquivo/test.txt");

        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("caralhooooooooo");
        }


    }
}
