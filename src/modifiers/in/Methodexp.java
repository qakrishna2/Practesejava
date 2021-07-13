package modifiers.in;


public class Methodexp extends Mod1 {
	
	public static void sample()
	{
		sample1();
		System.out.println("this is static method");
	}

		public void test()
		{
			System.out.println("this is instance method");
		}
	public static void main(String[] args) {
		System.out.println("this is main method");
		
		Methodexp me=new Methodexp();
		me.test();
		
		sample();
		
	}
	public static void sample1()
	{
		System.out.println("another static method");
	}
	
	}
