import java.util.Scanner;

public class urnaEletronica {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] candidatos=new String[7];
		int[] votos=new int[7];
		int opc;

		inicializacao(candidatos, votos, sc);
		boletim(candidatos, votos);
		opc=menu(candidatos, sc);
		while(opc>=0) {
			votos[opc]++;
			opc=menu(candidatos, sc);
		}
		boletim(candidatos, votos);
	}
	
	public static void inicializacao(String[] nomes,
			   						int[] votos, Scanner sc) {
		
		for(int i=0; i<votos.length; i++) {
			votos[i]=0;
		}
		
		nomes[0]="Brancos";
		nomes[6]="Nulos";
		for(int i=1; i<6; i++) {
			nomes[i]=sc.nextLine();
		}
	}
	
	public static int menu(String[] nomes, Scanner sc) {
		int opc;
		for(int i=0; i<nomes.length; i++) {
			System.out.println(i+" - "+nomes[i]);
		}
		System.out.println("Voto: ");
		opc=sc.nextInt();
		if(opc>6) {
			opc=6;
		}
		return opc;
	}
	
	public static void boletim(String[] nomes, int[] votos) {
		for(int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]+" - "+votos[i]);
		}
	}

}
