import java.util.ArrayList;

public class Pizza {
    private String nome;
    private double valor;
    private ArrayList<String> ingredientes;

    public Pizza(String nome, double valor, ArrayList<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void exibirInformacoes() {
        System.out.println("Pizza: " + nome);
        System.out.println("Preço: R$ " + valor);
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
    }
}
