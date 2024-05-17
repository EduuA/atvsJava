import java.util.Scanner;

public class L9Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] vet=new int[20];
		int i=0, j=10, n;
		while((i<10)||(j<20)) {
			n=sc.nextInt();
			if((n%2==0)&&(j<20)) {
				vet[j]=n;
				j++;
			}else {
				if((n%2==1)&&(i<10)) {
					vet[i]=n;
					i++;
				}
			}
		}
		
		for(i=0; i<vet.length; i++) {
			System.out.print(vet[i]+ " ");
		}

	}

}