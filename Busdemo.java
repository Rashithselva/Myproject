package Myproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Busdemo {
    public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2 ));
		buses.add(new Bus(2,false,3));
		buses.add(new Bus(3,false,2));
		
		int userp=1;
		
		
		for(Bus b:buses) {
			b.displaybusinfo();
		}
		while(userp==1){
		System.out.println("Enter 1 to Book press 2 Exit");
		userp=r.nextInt();
		if(userp==1) {
			Booking booking= new Booking();
		 	if(booking.isAvailable(bookings,buses)) {
		 		bookings.add(booking);
		 		System.out.println("Your booking is confirmed");
		 		
		 	}
		 	else
		 		System.out.println("Bus is full. Try another bus or date");
		}
        if(userp==2){
            System.out.println("Thank you...");
        }
		}
	}
}
