import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando pizzas disponíveis
        ArrayList<String> ingredientesPizza1 = new ArrayList<>();
        ingredientesPizza1.add("Queijo");
        ingredientesPizza1.add("Molho de tomate");
        ingredientesPizza1.add("Pepperoni");
        Pizza pizza1 = new Pizza("Pepperoni", 30.00, ingredientesPizza1);

        ArrayList<String> ingredientesPizza2 = new ArrayList<>();
        ingredientesPizza2.add("Queijo");
        ingredientesPizza2.add("Molho de tomate");
        ingredientesPizza2.add("Frango");
        Pizza pizza2 = new Pizza("Frango", 28.00, ingredientesPizza2);

        ArrayList<String> ingredientesPizza3 = new ArrayList<>();
        ingredientesPizza3.add("Queijo");
        ingredientesPizza3.add("Molho de tomate");
        ingredientesPizza3.add("Mussarela");
        Pizza pizza3 = new Pizza("Mussarela", 25.00, ingredientesPizza3);

        ArrayList<Pizza> menuPizzas = new ArrayList<>();
        menuPizzas.add(pizza1);
        menuPizzas.add(pizza2);
        menuPizzas.add(pizza3);

        // Scanner para interação
        Scanner scanner = new Scanner(System.in);

        // Menu de interação com o sistema
        while (true) {
            System.out.println("\n=== Pizzaria ===");
            System.out.println("1. Fazer pedido");
            System.out.println("2. Exibir relatório de pedidos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            if (opcao == 1) {
                // Exibir menu de pizzas
                System.out.println("\nEscolha uma pizza do menu:");
                for (int i = 0; i < menuPizzas.size(); i++) {
                    System.out.println((i + 1) + ". " + menuPizzas.get(i).getNome());
                }
                System.out.print("Escolha o número da pizza: ");
                int numeroPizza = scanner.nextInt();
                scanner.nextLine();  // Limpar o buffer
                Pizza pizzaEscolhida = menuPizzas.get(numeroPizza - 1);

                // Informações de entrega
                System.out.print("Informe o endereço de entrega: ");
                String endereco = scanner.nextLine();

                // Criar o pedido
                new Pedido(pizzaEscolhida, endereco);
                System.out.println("\nPedido realizado com sucesso!");

            } else if (opcao == 2) {
                // Exibir relatório
                Pedido.exibirRelatorio();

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}
