package variablestest.in;

import modifiers.in.Modifiersexmp1;

public class Modifiersexmp2 extends Modifiersexmp1 {
	
	//protected int p=11;


	public static void main(String[] args) {
		
		Modifiersexmp1 mp1=new Modifiersexmp1();
		System.out.println(mp1.a);
		//System.out.println(mp1.b);
		System.out.println(Modifiersexmp1.a);

		System.out.println(mp1.c);
		//System.out.println(mp1.p);
		//System.out.println(mp1.n);
		
		Modifiersexmp2 mp2=new Modifiersexmp2();
		
		System.out.println(mp2.p);
		System.out.println(mp2.n);
		
	}

}
