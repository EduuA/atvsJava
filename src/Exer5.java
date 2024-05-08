
public class Exer5 {
    public static void main(String[] args) {
		System.out.println(sA(2));
		System.out.println(sB(2));
		System.out.println(sC(2));
	}
	
	public static double sA(int n) {
		double s=0;
		for(int i=1; i<=n; i++) {
			s += 1.0/i;
		}
		return s;
	}

	public static double sB(int n) {
		int j=n;
		double s=0;
		for( int i=1; i<=n; i++) {
			s += (double)i/j;
			j--;
		}
		return s;
	}
	
	public static double sC(int n) {
		double s=0;
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				s -= 1.0/i;
			}else {
				s += 1.0/i;
			}
		}
		return s;
	}
}
