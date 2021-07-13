package interfaceexp.in;

public class B implements A {
	
			public void one()
			{
				System.out.println("first");
			}
			public void two()
			{
				System.out.println("second");
			}
			public void three()
			{
				System.out.println("third");
			}
			public static void main(String[] args) {
				B b=new B();
				b.one();
				b.two();
				b.three();
			}
}
