package collections.in;

import java.util.ArrayList;
import java.util.List;

public class Listexmp {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("java");
		list.add("selenium");
		list.add("python");
		list.add("tester");
		list.add(1,"main");
		list.add(2,"main1");
		System.out.println(list);
		List<Integer> list1=new ArrayList();
		list1.add(5);
		list1.add(10);
		System.out.println(list1.addAll(0, list));
	}

}
