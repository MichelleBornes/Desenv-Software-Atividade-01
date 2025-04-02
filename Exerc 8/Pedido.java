import java.util.ArrayList;

public class Pedido {
    private Pizza pizza;
    private String enderecoEntrega;
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pedido(Pizza pizza, String enderecoEntrega) {
        this.pizza = pizza;
        this.enderecoEntrega = enderecoEntrega;
        pedidos.add(this);  // Adiciona o pedido à lista
    }

    public static int getTotalPedidos() {
        return pedidos.size();
    }

    public static double getMediaPrecoPedidos() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.pizza.getValor();
        }
        return total / pedidos.size();
    }

    public static void exibirRelatorio() {
        System.out.println("Relatório de Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("Pizza: " + pedido.pizza.getNome());
            System.out.println("Endereço de entrega: " + pedido.enderecoEntrega);
            System.out.println("Valor: R$ " + pedido.pizza.getValor());
            System.out.println("-----");
        }
        System.out.println("Número total de pedidos: " + getTotalPedidos());
        System.out.println("Preço médio dos pedidos: R$ " + getMediaPrecoPedidos());
    }
}
