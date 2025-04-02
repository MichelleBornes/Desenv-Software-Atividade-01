public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford", "Mustang", 1969, "XYZ-5678");
        carro1.exibirInformacoes();

        carro1.acelerar(75);
        System.out.println("\nApós acelerar:");
        carro1.exibirInformacoes();

        carro1.frear(40);
        System.out.println("\nApós frear:");
        carro1.exibirInformacoes();
    }
}
