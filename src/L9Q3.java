import java.util.Scanner;

public class L9Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] qtd=new int[100];
		double[] vlr=new double[100];
		int n, tam=0;
		double soma=0;
		System.out.println("Quantidade:");
		n=sc.nextInt();
		while(n!=-1) {
			qtd[tam]=n;
			System.out.println("Valor");
			vlr[tam]=sc.nextDouble();
			tam++;
			System.out.println("Quantidade:");
			n=sc.nextInt();
		}
		for(int i=0; i<tam; i++) {
			System.out.println(qtd[i]+" x "+vlr[i]+" = "+(qtd[i]*vlr[i]));
			soma+=(qtd[i]*vlr[i]);
		}
		System.out.println("Total = "+soma);

	}

}