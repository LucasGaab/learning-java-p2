import java.util.Scanner;

public class MediaTresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        double soma = 0;

        System.out.println("Informe três notas, em sequência:");
        for (int i = 0; i < 3; i++) {
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 3;
        System.out.println("Média aritmética: " + media);
        scanner.close();
    }
}
