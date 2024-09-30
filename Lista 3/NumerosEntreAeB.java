import java.util.Scanner;

public class NumerosEntreAeB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Série numérica: ");
        for (int i = A + 1; i < B; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}
