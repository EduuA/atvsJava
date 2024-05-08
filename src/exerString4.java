
public class exerString4 {
    public static void main(String[] args) {
        System.out.println(subtrai("paralelepipedo", "arara"));

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

    public static String subtrai(String str, String sub) {
		int x, y;
		String resp;
		x=str.indexOf(sub);
		y=x+sub.length();
		resp=str.substring(0, x)+str.substring(y, str.length());
		return resp;
	}
}
