import java.util.Random;

public class javaVetor2 {

	public static void main(String[] args) {
		int[] vet1=new int[5];
        int[] vet2=new int[5];
        int[] vet3;
		preenche(vet1);
		mostra(vet1);
        preenche(vet2);
        mostra(vet2);
        vet3 = soma(vet1, vet2);
        mostra(vet3);

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
    public static int[] soma(int[]v1, int[]v2){
        int[] v3= new int[v1.length];
        for(int i= 0;i<v1.length; i++){
            v3[i]=v1[i]+v2[i];
        }
        return v3;
    }

}
