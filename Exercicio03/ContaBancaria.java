public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        }
        else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public double getSaldo() {

        System.out.println("Saldo atual: " + saldo);

        return saldo;
    }

    public void exibirInfo() {
        System.out.println("\n------ Detalhes da Conta ------");
        System.out.println("Nome do Titular: " + nomeTitular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo disponível: " + saldo);
    }

}
