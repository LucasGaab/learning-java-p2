import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        String resultado = maior(numero1, numero2);
        System.out.println(resultado);

        scanner.close();
    }

    public static String maior(int num1, int num2) {
        if (num1 > num2) {
            return "O maior é: " + num1;
        } else if (num2 > num1) {
            return "O maior é: " + num2;
        } else {
            return "Os números são iguais";
        }
    }
}
