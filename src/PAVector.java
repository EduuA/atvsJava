public class PAVector {

	public static void main(String[] args) {
		int[] vet = new int[10];
		preenchePA(vet, 2, 3);
		mostra(vet);

	}
	
	public static void preenchePA(int[] v, int t1, int rz) {
		v[0]=t1;
		for(int i=1; i<v.length; i++) {
			v[i]=v[i-1]+rz;
		}
	}
	
	public static void mostra(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}

}