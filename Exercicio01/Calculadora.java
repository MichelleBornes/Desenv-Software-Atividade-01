public class Calculadora {

    public static double soma(double a, double b) {

        return a + b;
    }

    public static double sub(double a, double b) {

        return a - b;
    }

    public static double mult(double a, double b) {

        return a * b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.print("Erro: tente novamente!\n");

            return 0;
        }
        return a / b;
    }
}

