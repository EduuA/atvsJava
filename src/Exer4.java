import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        char resp;
        
        System.out.println("Quer ver uma tabuada?");
        resp = sc.next().charAt(0);

        while ((resp == 's') || (resp == 'S')) {
            System.out.println("Qual tabuada");
            n = sc.nextInt();
            tabuada(n);
            System.out.println("Quer ver uma tabuada?");
            resp = sc.next().charAt(0);
        }

    }

    public static void tabuada(int n) {
        System.out.println("Tabuada de " + n);
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + n * i);
        }
    }

}
