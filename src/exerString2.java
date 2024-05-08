import java.util.Scanner;

public class exerString2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        piramide("palavra");

    }

    public static void vertical(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }
    }

    public static void piramide(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(palavra.charAt(j));
            }
            System.out.println();
        }
    }

}
