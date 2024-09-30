import java.util.Scanner;

public class DividirVetorPor100 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o dado da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        dividir100(vetor);

        System.out.println("Conteúdo dividido por 100:");
        for (double valor : vetor) {
            System.out.println(valor);
        }

        scanner.close();
    }

    public static void dividir100(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] /= 100;
        }
    }
}
