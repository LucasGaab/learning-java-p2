import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();

        String resultado = parImpar(numero);
        System.out.println(resultado);

        scanner.close();
    }

    public static String parImpar(int numero) {
        if (numero % 2 == 0) {
            return numero + " é par.";
        } else {
            return numero + " é ímpar.";
        }
    }
}
