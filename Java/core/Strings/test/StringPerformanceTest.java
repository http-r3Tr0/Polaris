package Polaris.Java.core.Strings.test;

public class StringPerformanceTest {
    static void main() {
    long inicio = System.currentTimeMillis();
    concatString(30_000);
    long fim = System.currentTimeMillis();
        System.out.println("tempo gasto para string "+(fim-inicio)+"ms");
    inicio = System.currentTimeMillis();
    concatStringBuilder(1_000_000);
    fim = System.currentTimeMillis();
    System.out.println("tempo gasto para StringBuilder " + (fim-inicio)+"ms");

    inicio = System.currentTimeMillis();
    concatStringBuffer(1_000_000);
    fim = System.currentTimeMillis();
    System.out.println("tempo gasto para StringBuffer " + (fim-inicio)+"ms");



    }
    private static void concatString(int tempo){
        String text = "";
        for (int i = 0; i < tempo; i++) {
            text += i;
        }
    }
    private static void concatStringBuilder(int tempo){
        StringBuilder bf = new StringBuilder(tempo);
        for (int i = 0; i < tempo; i++) {
            bf.append(i);
        }

    }
    private static void concatStringBuffer(int tempo){
        StringBuffer stringBuffer = new StringBuffer(tempo);
        for (int i = 0; i < tempo; i++) {
            stringBuffer.append(i);
        }
    }
}
