package Java.core.test;

import Java.core.dominio.Aula01;

public class Aula01Test {
    public static void main(String[] args){
        Aula01 estudante = new Aula01();
        estudante.idade = 21;
        estudante.name = "nunes";
        estudante.sexo = 'M';
        estudante.id = 121243;
        Aula01 estudante2 = new Aula01();
        estudante2.idade = 23;
        estudante2.name = "dasha";
        System.out.println(estudante.name);
    }
}
