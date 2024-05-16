
import java.util.Scanner;

public class mediasFinais2 {

	public static void main(String[] args) {
		double[] vet=new double[5];
		preenche(vet);
		System.out.println(media(vet));
		System.out.println(contaAcimaMedia(vet));

	}
	
	public static void preenche(double[] v) {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<v.length; i++) {
			v[i]=sc.nextDouble();
		}
	}
	
	public static double media(double[] v) {
		double soma=0;
		for(int i=0; i<v.length; i++) {
			soma+=v[i];
		}
		return soma/v.length;
	}
	
	public static int contaAcimaMedia(double[] v) {
		double md=media(v);
		int cont=0;
		for(int i=0; i<v.length; i++) {
			if(v[i]>md) {
				cont++;
			}
		}
		return cont;
	}

}

