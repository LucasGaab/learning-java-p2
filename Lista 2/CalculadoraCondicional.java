import java.util.Scanner;

public class CalculadoraCondicional {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Insira o segundo valor: ");
        int segundoValor = scanner.nextInt();

        if (primeiroValor == segundoValor) {
            int multiplicacao = primeiroValor * segundoValor;
            System.out.println("Multiplicação: " + multiplicacao);
        } else if (primeiroValor > segundoValor) {
            int subtracao = primeiroValor - segundoValor;
            System.out.println("Subtração: " + subtracao);
        } else {
            int soma = primeiroValor + segundoValor;
            System.out.println("Soma: " + soma);
        }

        scanner.close();
    }
}
