import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("----- Acessando à conta ----");

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = leitor.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite o saldo disponível: ");
        double saldoInicial = leitor.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);
        int opcao = 0;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("4 - Exibir dados");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção: ");
            opcao = leitor.nextInt();

            float saldo = 0;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double deposito = leitor.nextDouble();

                    conta.depositar(deposito);

                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = leitor.nextDouble();

                    conta.saque(saque);

                    break;

                case 3:

                    conta.getSaldo();

                    break;

                case 4:

                    conta.exibirInfo();

                    break;

                case 5:
                    System.out.print("Saindo...");

                    break;

                default:
                    System.out.print("Valor inválido! Tente novamente.");
            }
        } while (opcao != 5);

    }
}