package loopsexamples.in;

public class LabLoop {
	public static void main(String[] args) {
		aa:
		for(int i=1;i<=3;i++) {
			bb:
			for(int j=1;j<=4;j++) {
				if(i==2&&j==2) {
					break bb;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
