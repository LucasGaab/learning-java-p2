import java.util.Scanner;

public class NumerosImparesEntreAeB {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Insira o valor de B: ");
        int B = scanner.nextInt();

        for (int i = A; i <= B; i++) {
            if (i % 2 != 0) {
                System.out.println("É ímpar: " + i);
            }
        }

        scanner.close();
    }
}
