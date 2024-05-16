public class q4Lista{

	public static void main(String[] args) {
		int[] vet;
		vet=fiboVector(10);
		mostra(vet);

	}
	
	public static void mostra(int[] v) {
		for(int i=0; i<v.length; i++) {
			System.out.print(v[i]+" ");
		}
		System.out.println();
	}
	
	public static int[] fiboVector(int n) {
		int[] v=new int[n];
		int a=1, b=1, c=a+b;
		for(int i=0; i<v.length; i++) {
			v[i]=a;
			a=b; 
			b=c;
			c=a+b;
		}
		return v;
	}
}