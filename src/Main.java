import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<>();


        //Livro[] biblioteca = new Livro[2];

        biblioteca.add(new Livro("É Assim que Começa", "Collen Hoover", 2020));
        biblioteca.add(new Livro("O senhor dos Anéis", "J.R.R. Tolkien", 1954));

        int opcao = 0;

        do {
            System.out.println("\nBem-Vindo à Biblioteca");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Sair");

            System.out.print("Digite a opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n----- Cadastrando livro -----");

                    System.out.print("Titulo: ");
                    String titulo = leitor.nextLine();
                    leitor.nextLine();

                    System.out.print("Autor: ");
                    String autor = leitor.nextLine();

                    System.out.print("Ano de Publicação: ");
                    int ano = leitor.nextInt();
                    leitor.nextLine();

                    biblioteca.add(new Livro(titulo, autor, ano));

                    System.out.println("Livro cadastrado com sucesso!");

                    break;

                case 2:
                    System.out.println("\n----- Listando livros -----");

                    for (Livro livro : biblioteca) {
                        livro.exibirInfo();
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");

                    break;
            }

        } while (opcao != 3);

    }
}