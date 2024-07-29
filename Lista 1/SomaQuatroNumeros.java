import java.util.Scanner;

public class SomaQuatroNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[4];
        int soma = 0;

        System.out.println("Informe quatro números, em sequência:");
        for (int i = 0; i < 4; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        System.out.println("Resultado da soma: " + soma);
        scanner.close();
    }
}
