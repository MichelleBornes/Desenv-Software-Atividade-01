import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int opcao;
        char escolha = ' ';

         do {
            System.out.println("----- Calculadora ------");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");

            System.out.print("Digite a opcão: ");
            opcao = leitor.nextInt();

            if (opcao < 1  || opcao > 4) {
                System.out.println("Opção inváilda! Tente novamnete.");
                continue;
            }

            System.out.print("Digite um número: ");
            double num1 = leitor.nextDouble();

            System.out.print("Digite outro número: ");
            double num2 = leitor.nextDouble();

            double resultado = 0;

            switch (opcao) {
                 case 1:
                     resultado = Calculadora.soma(num1,num2);
                     System.out.println("Soma dos números: " + resultado);

                     break;

                 case 2:
                     resultado = Calculadora.sub(num1, num2);
                     System.out.println("Subtração dos números: " + resultado);

                     break;

                 case 3:
                     resultado = Calculadora.mult(num1, num2);
                     System.out.println("Multiplicação dos números: " + resultado);

                     break;

                 case 4:
                     resultado = Calculadora.div(num1, num2);
                     System.out.println("Divisão dos números: " + resultado);

                     break;
             }

             System.out.print("Deseja fazer outra operação? [S / N]: ");
             escolha = leitor.next().charAt(0);


        } while (escolha == 'S' || escolha == 's');

        System.out.print("Saindo!");

        leitor.close();
    }


}