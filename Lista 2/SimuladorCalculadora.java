import java.util.Scanner;

public class SimuladorCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");

        int operacao = scanner.nextInt();

        System.out.print("Insira o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Insira o segundo valor: ");
        int segundoValor = scanner.nextInt();

        switch (operacao) {
            case 1:
                int soma = primeiroValor + segundoValor;
                System.out.println("Soma: " + soma);
                break;
            case 2:
                int subtracao = primeiroValor - segundoValor;
                System.out.println("Subtração: " + subtracao);
                break;
            case 3:
                int multiplicacao = primeiroValor * segundoValor;
                System.out.println("Multiplicação: " + multiplicacao);
                break;
            case 4:
                if (segundoValor != 0) {
                    int divisao = primeiroValor / segundoValor;
                    System.out.println("Divisão: " + divisao);
                } else {
                    System.out.println("Divisão por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
