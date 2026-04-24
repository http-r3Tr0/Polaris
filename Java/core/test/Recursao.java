package Java.core.test;

public class Recursao {
    public static int sum(int k){
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }
    public static void main(String[] args) {
        int resultado = sum(13);
        System.out.println(resultado);
    }

}
