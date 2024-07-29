import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a base:");
        double base = scanner.nextDouble();

        System.out.println("Insira a altura:");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        System.out.println("Área do triângulo: " + area);
        scanner.close();
    }
}
