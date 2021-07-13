package exceptions.in;

public class Exception2 {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			System.out.println(a[4]=20);
			a[5]=50;
		}catch(ArithmeticException e) {
			System.out.println("Arithemeticexception rised");
		}catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("ArrayindexOutOfBound Exception rised");
		}catch(Exception e) {
			System.out.println("main exception rised");
		}
		System.out.println("out of the code");
	}

}
