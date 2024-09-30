import java.util.Scanner;

public class VerificadorDeNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int N = scanner.nextInt();

        if (ehPrimo(N)) {
            System.out.println(N + " é primo.");
        } else {
            System.out.println(N + " não é primo.");
        }

        scanner.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
