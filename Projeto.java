import java.util.Scanner;

public class Projeto{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Password;
        String Username;
        int saldo = 1500;

        Username = "nunes";
        Password = "123";

        System.out.println("Seja bem vindo, cadastre-se!");

        System.out.print("Digite o seu nome de usuário: ");
        Username = scanner.next();

        System.out.print("Digite a sua senha: ");
        Password = scanner.next();

        String usuario_acesso;
        String senha_acesso;

        System.out.println("============ Seja bem vindo ao Caixa eletrônico ============");

        //verifica se esta certo
        System.out.print("Digite o nome do usuário: ");
        usuario_acesso = scanner.next();

        System.out.print("Digite a sua Password: ");
        senha_acesso = scanner.next();


        if (usuario_acesso.equals(Username) && senha_acesso.equals(Password)) {

            System.out.println("Acesso liberado!\nSeja bem vindo " + Username);
            int decision = 0;
            while (decision != 4) {
                System.out.println("O que deseja fazer: \nVer Saldo - 1\nRealizar Saque - 2\nRealizar Depósito - 3\nSair - 4");

                decision = scanner.nextInt();
                switch (decision) {
                    case 1:
                        System.out.println("Seu saldo atual é de: R$"+saldo);
                            break;
                    case 2:
                        System.out.println("digite o valor que você deseja retirar ");
                        int retirada = scanner.nextInt();
                        saldo = saldo - retirada;
                        System.out.println("Após o saque seu saldo atual é de: R$"+saldo);
                            break;
                    case 3:
                        System.out.println("Digite o valor que você deseja depositar");
                        int deposito = scanner.nextInt();
                        saldo = saldo + deposito;
                        System.out.println("Seu saldo atual é de: R$"+saldo);
                            break;
                        default:
                        System.out.println("escolha um numero valido porra");
                        break;
                }

            }
        }
        }
}