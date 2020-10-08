package com.cg.lab3_String;
import java.util.Scanner;
import java.time.*;

public class Ex7_DateDuration {
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the date");
		int day= scan.nextInt();
		System.out.println("Enter the month");
		int month=scan.nextInt();
		System.out.println("Enter the year");
		int year=scan.nextInt();


		LocalDate localdate = LocalDate.of(year,month,day);
        LocalDate currentdate = LocalDate.now();
 
        Period diff = Period.between(localdate, currentdate);
        
        System.out.print("Duration is "+diff.getYears()+" years "+
        		diff.getMonths()+" months "+diff.getDays()+" days");
	

	}
}
