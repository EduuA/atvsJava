import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a, b;
        System.out.println("Informe dois numeros: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        menu(a, b);

    }

    public static void menu(float a, float b) {
        Scanner sc = new Scanner(System.in);
        int n;
        float soma;

        System.out.println("\n\nMenu");
        System.out.println("1 - Soma\n\n" + "2-Subtração\n\n" + "3-Multiplicação\n\n" + "4-Divisão\n\n"
                + "5-Troca de valores\n\n" + "6-Sair\n\n");
        n = sc.nextInt();

        switch (n) {
            case 1:
                soma = a + b;
                System.out.println("O valor da soma é: " + soma);
                break;

            case 2:
                soma = a - b;
                System.out.println("O valor da subtração é: " + soma);
                break;
            case 3:
                soma = a * b;
                System.out.println("O valor da multiplicacao é: " + soma);
                break;

            case 4:
                soma = a / b;
                System.out.println("O valor da divisao é: " + soma);
                break;

            case 5:
                System.out.println("O valor trocado é: ");
                break;

            case 6:
                System.out.println("Saindo ");
                break;
            default:
                System.out.println("Nao existe essa opçao");
                break;
        }
    }

}
