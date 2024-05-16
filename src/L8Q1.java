import java.util.Scanner;

public class L8Q1 {

	public static void main(String[] args) {
		String[] nomes=new String[5];
		int[] idades= new int[5];
		entradaDados(nomes, idades);
		System.out.println(media(idades));
		acimaMedia(nomes, idades);

	}
	
	public static void entradaDados(String[] nomes, int[] id) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<nomes.length; i++) {
			System.out.println("Nome:");
			nomes[i]=sc.nextLine();
			System.out.println("Idade:");
			id[i]=sc.nextInt();
			sc.nextLine();
		}
	
	}
	
	public static int media(int[] v) {
		int soma=0;
		for(int i=0; i<v.length; i++) {
			soma+=v[i];
		}
		return soma/v.length;
	}
	
	public static void acimaMedia(String[] nomes, int[] id) {
		int md=media(id);
		for(int i=0; i<nomes.length; i++) {
			if(id[i]>md) {
				System.out.println(nomes[i]);
			}
		}
	}

}
