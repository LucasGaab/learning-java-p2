import java.util.Scanner;

public class BuscaEmVetor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira o dado da posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Insira a chave de busca: ");
        int chave = scanner.nextInt();

        boolean encontrada = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                System.out.println("Chave encontrada na posição: " + (i + 1));
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Chave não encontrada!");
        }

        scanner.close();
    }
}
