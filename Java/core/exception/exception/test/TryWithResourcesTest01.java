package Polaris.Java.core.exception.exception.test;

import Polaris.Java.core.exception.exception.dominio.Leitor1;
import Polaris.Java.core.exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    static void main() {
    lerArquivo();
    }
    public static void lerArquivo() {
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2();) {

        } catch (IOException e){

        }
    }


    public static void lerArquivo2(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("Texto.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try{
                if(reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
