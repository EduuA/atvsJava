import java.util.Scanner;

public class vetorInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor = 50;
        int[] vetor = new int[tamanhoVetor];

        // Preenchimento do vetor
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite um número inteiro: ");
            vetor[i] = scanner.nextInt();
        }

        // Exibição dos valores na ordem inversa
        System.out.println("\nValores digitados na ordem inversa:");
        for (int i = tamanhoVetor - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}