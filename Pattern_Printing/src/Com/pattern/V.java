package Com.pattern;

public class V {
	public static void main(String[] args) {
		int n=10;
		for(int i=0 ; i<n*2 ; i++) {
			for(int j=0; j<n*2 ; j++) {
				if(i==j&&i<(n-1)/2||(i+j)==(n-1)&&i<(n)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
