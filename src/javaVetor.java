import java.util.Random;

public class javaVetor {

	public static void main(String[] args) {
		int[] vet1=new int[5];
		preenche(vet1);
		mostra(vet1);
		System.out.println(maiorVetor(vet1));

	}
	
	public static void preenche(int[] v) {
		Random rand=new Random();
		
		for(int i=0; i<v.length; i++) {
			v[i]=rand.nextInt(10);
		}
	}
	
	public static void mostra(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}

	public static int maiorVetor(int[] vetor){
		int posicaoMaior = 0;
		for(int i =0 ; i<vetor.length; i++){
			if(vetor[i]> vetor[posicaoMaior]){
				posicaoMaior = i;
			}
		}
		return posicaoMaior;
	}

}