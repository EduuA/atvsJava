import java.util.Scanner;

public class exerString {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        vertical("palavra");

    }

    public static void vertical(String palavra) {
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println(palavra.charAt(i));
        }

    }

}
