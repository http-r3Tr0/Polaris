package Polaris.Java.core.exception.exception.test;

import Polaris.Java.core.exception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoTest01{
    static void main() {
        try {
            login();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }
    public static void login() throws LoginInvalidoException{
        String userName = "goku";
        String password = "ssj3";
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome do usuario: ");
        String digitadoUsername = sc.nextLine();

        System.out.println("digite a senha: ");
        String digitadoPassword = sc.nextLine();

        if (!userName.equals(digitadoUsername)|| !password.equals(digitadoPassword)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Seja bem vindo! ");

        }
    }

