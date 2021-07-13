package dateFormate.in;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class DateformateDemo {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getMonth());
		date.setMonth(6);
		System.out.println(date.getMonth());
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		System.out.println(sdf.format(date));
		
		//java8
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.plusHours(3));
	}

}
