import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao = 0;

        Jogador jogador = null;

        do {

            System.out.println("\n------ MENU -----");
            System.out.println("1 - Criar perfil");
            System.out.println("2 - Atualizar pontuação");
            System.out.println("3 - Atualizar nível");
            System.out.println("4 - Exibir jogador");
            System.out.println("5 - Sair");

            System.out.print("Digite a opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n------ Criando perfil ------");

                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    //leitor.nextLine();

                    System.out.print("Pontuação: ");
                    float pontuacao = leitor.nextFloat();

                    System.out.print("Nível: ");
                    int nivel = leitor.nextInt();

                    jogador = new Jogador(nome, pontuacao, nivel);
                    System.out.println("Jogador criado com sucesso!");

                    break;

                case 2:
                    if (jogador != null) {
                        System.out.print("Informe a pontuação do jogador: ");
                        float pontuacaoAtual = leitor.nextFloat();
                        jogador.mudarPontuacao(pontuacaoAtual);
                    }
                    else {
                        System.out.println("Jogador não criado ainda");
                    }

                    break;

                case 3:
                    if (jogador != null) {
                        System.out.print("Informe o nível atual do jogador: ");
                        int nivelAtual = leitor.nextInt();

                        jogador.mudarNivel(nivelAtual);
                    }
                    else {
                        System.out.println("Jogador não criado ainda");
                    }

                    break;

                case 4:
                    if (jogador != null) {
                        jogador.exibirInfo();
                    }
                    else {
                        System.out.println("Jogador não criado ainda");
                    }

                    break;

                case 5:
                    System.out.println("Saindo....");

                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        leitor.close();

    }
}