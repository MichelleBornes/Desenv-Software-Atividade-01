import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando lista para armazenar os produtos
        ArrayList<Produto> estoque = new ArrayList<>();

        // Adicionando produtos ao estoque
        Produto produto1 = new Produto("Arroz", "AR123", 5.99, 50);
        Produto produto2 = new Produto("Feijão", "FE456", 4.49, 30);
        Produto produto3 = new Produto("Óleo", "OL789", 6.29, 20);

        estoque.add(produto1);
        estoque.add(produto2);
        estoque.add(produto3);

        // Exibindo estoque atual
        System.out.println("Estoque atual:");
        for (Produto produto : estoque) {
            produto.exibirInformacoes();
            System.out.println("-----");
        }

        // Atualizando a quantidade de um produto
        System.out.println("\nAtualizando a quantidade do produto Arroz...");
        produto1.setQuantidadeEstoque(60);
        produto1.exibirInformacoes();

        // Atualizando o preço de um produto
        System.out.println("\nAtualizando o preço do produto Feijão...");
        produto2.atualizarPreco(5.29);
        produto2.exibirInformacoes();

        // Removendo um produto do estoque
        System.out.println("\nRemovendo o produto Óleo do estoque...");
        estoque.remove(produto3);

        // Exibindo o estoque após remoção
        System.out.println("\nEstoque após remoção:");
        for (Produto produto : estoque) {
            produto.exibirInformacoes();
            System.out.println("-----");
        }

        // Gerando relatório do valor total em estoque
        double valorTotalEstoque = 0;
        for (Produto produto : estoque) {
            valorTotalEstoque += produto.getPreco() * produto.getQuantidadeEstoque();
        }
        System.out.println("\nValor total em estoque: R$ " + valorTotalEstoque);
    }
}
