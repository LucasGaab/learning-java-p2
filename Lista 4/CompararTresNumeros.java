import java.util.Scanner;

public class CompararTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Insira o primeiro número: ");
        numeros[0] = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        numeros[1] = scanner.nextInt();

        System.out.print("Insira o terceiro número: ");
        numeros[2] = scanner.nextInt();

        String resultado = isFirstGreater(numeros);
        System.out.println(resultado);

        scanner.close();
    }

    public static String isFirstGreater(int[] numeros) {
        if (numeros[0] > numeros[1] && numeros[0] > numeros[2] && numeros[0] != numeros[1] && numeros[0] != numeros[2]) {
            return "Condição satisfeita";
        } else {
            return "Erro";
        }
    }
}
