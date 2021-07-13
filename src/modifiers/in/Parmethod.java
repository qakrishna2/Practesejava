package modifiers.in;

public class Parmethod {
	
	public  int one()
	{
		int c=10;
		int d=26;
		return c+d;
		
	}
	public static void main(String[] args) {
		Parmethod pm=new Parmethod();
		System.out.println(pm.one());
		
		
		int [] i= {1,2,3,4,5,6};
		array(i);
	
	}
	public static void array(int [] a) {
		//for(int i=1;i<=a.length;i++)
			//System.out.println(i);
		for(int i: a)
			System.out.println(i);
	}
		
		

}
