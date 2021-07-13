package constructorExample.in;

public class Constructorexp {
	//String name;
	//int no;
	
	//void display() {
		//System.out.println(name+" "+no);
	//}
	
	public Constructorexp(String name,int no)
	{
		System.out.println(name+" "+no);
	}
	public static void main(String[] args) {
		
		Constructorexp c2=new Constructorexp("java",11);
	}

}
