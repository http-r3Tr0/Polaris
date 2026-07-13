package Polaris.Java.core.exception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args){
        System.out.println(divisao(1,0));
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, b não pode ser zero");
        } return a/b;
    }
}
