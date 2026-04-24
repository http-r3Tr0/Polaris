package Java.core.IntroducaoMetodos.dominio;

public class Copos {
    public String Material;
    public  String Transparencia;
    public int Mls;

    public void EstaCheio() {
       if (Mls > 250) {
           System.out.println("Copo cheio");
       } else  {
           System.out.println("Copo meio cheio");
       }
    }
}
