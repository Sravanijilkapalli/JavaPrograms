package hello;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		
		String date = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(Calendar.getInstance().getTime());
		
		System.out.println(date);
		
		Date date1 = new Date(System.currentTimeMillis());
		
		System.out.println(date1);
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		
	}

}
