package Java.core.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    public void subitraiDoisNumeros(int a, int b){
        System.out.println(a - b);
    }
    public void separaDoisNumeros(){
        System.out.println(49 / 7);
    }
    public void multiplicandoDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }
    public void testeIfs(int a, int b) {
        if (a > b){
            System.out.println(a+" é maior que "+b);
        } else {
            System.out.println(b+" é maior que "+a);
        }

    }
    public String nome; //isso aqui é um atributo

    public int divideDoisNumeros(double num1, double num2) {
    if (num2 == 0){
        return 0;
    }
        return (int) (num1/num2);
    }

    public void mudaNumero(int numero1, int numero2){
        numero1 = 33;
        numero2 = 99;

        System.out.println("Entrou no mudaNumero");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 "+ numero2);
    }
    public void fatorial(int n) {
        int result = 1;
        for (int i=1; i <= n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
