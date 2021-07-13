package overloading.in;

public class Polymor {
	static int a=1;
	static String b="S";
	static int c=3;
	
	public void display()
	{
		System.out.println("no parameters");
	}
	public void display(int a) {
		System.out.println("single parameters "+a);
	}
	public void display(int a,int c)
	{
		System.out.println("double parameter "+a +" "+c);
	}
	public void display(int a,String b)
	{
		System.out.println("double String parameter "+a +" "+b);
	}
	public void display(int a,String b,int c)
	{
		System.out.println("thribul parameter "+a +" "+b+" "+c);
	}
	public static void main(String[] args) {
		Polymor pm=new Polymor();
		pm.display();
		pm.display(11);
		pm.display(10,"krish");
		pm.display(15,"main",20);
		
	}

}
