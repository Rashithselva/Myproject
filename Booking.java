package Myproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passenger_name;
		int bNo;
		Date date;
		
		Booking(){
			Scanner r=new Scanner(System.in);
			System.out.println("Enter passenger name");
			passenger_name=r.next();
			System.out.println("Enter the bus number");
			bNo=r.nextInt();
			System.out.println("Enter date dd-mm-yyyy");
			String dateInput=r.next();
			SimpleDateFormat dateFormet = new SimpleDateFormat("dd-MM-yyyy");
			try {
				date=dateFormet.parse(dateInput);
			} catch (ParseException e) {
			
				e.printStackTrace();
			}
		}
		public boolean isAvailable(ArrayList<Booking>bookings,ArrayList<Bus> buses) {
			int caps =0;
			for(Bus b:buses) {
				if(b. getbno() == bNo)
					caps =b.getCap();
			}
			
			int bookcount=0;
			for(Booking bus:bookings) {
				if(bus.bNo == bNo && bus.date.equals(date)) {
					bookcount++;
				}
			}
			return bookcount<caps?true:false;
			
		}
    
}
