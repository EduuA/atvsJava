
public class exerString3 {
    public static void main(String[] args) {
        System.out.println(quantidadeLetras("ararararararara"));

    }

    public static int quantidadeLetras(String palavra) {
        int contador = 0;
        int i;
        for (i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                contador++;
            }
        }
        return contador;
    }

}
