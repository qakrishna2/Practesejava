package loopsexamples.in;

public class StarDecending {
	public static void main(String[] args) {
		//int des=9;
		for(int i=1;i<=9;i++) {
			for(int j=9;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
