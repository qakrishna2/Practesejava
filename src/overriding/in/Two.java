package overriding.in;

public class Two extends One {
	public void display() {
		System.out.println("this is rided method");
	}
	public void display1()
	{
		System.out.println("second over ride");
	}
	public static void main(String[] args) {
		
		One t1=new Two();
		t1.display();
		t1.display1();
	}

}
