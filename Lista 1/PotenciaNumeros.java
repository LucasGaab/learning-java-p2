import java.util.Scanner;
import java.lang.Math;

public class PotenciaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro número:");
        double base = scanner.nextDouble();

        System.out.println("Insira o segundo número:");
        double expoente = scanner.nextDouble();

        double resultado = Math.pow(base, expoente);
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
