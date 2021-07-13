package exceptions.in;

import java.io.IOException;

import com.sun.source.tree.CatchTree;

public class Arithmeticexception {
	public static void main(String[] args) {
		try {
		int data=50/0;
		}catch(RuntimeException e) {
			System.out.println(e);
		}
		System.out.println("out of exception");
	}

}
