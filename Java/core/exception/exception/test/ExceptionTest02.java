package Polaris.Java.core.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
    criarTexto();
    }

  private static void criarTexto() throws IOException{
            File file = new File("/home/fernandonunes/IdeaProjects/Polaris/src/Polaris/Java/core/exception/exception/test/arquivo/test.txt");
            try {
                boolean isCriado = file.createNewFile();
                System.out.println("Arquivo criado " + isCriado);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ;

        }
    }
