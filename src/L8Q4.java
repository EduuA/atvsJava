
public class L8Q4 {

	public static void main(String[] args) {
		int[] vet=new int[10];
		preenchePA(vet, 2, 3);
		mostra(vet);

	}
	
	public static void mostra(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	
	public static void preenchePA(int[] v, int pt, int rz) {
		v[0]=pt;
		for(int i=1; i<v.length; i++) {
			v[i]=v[i-1]+rz;
		} 
	}

}
