public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, String codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Valor total em estoque: R$ " + (preco * quantidadeEstoque));
    }
}
