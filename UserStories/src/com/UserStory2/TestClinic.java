package com.UserStory2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
public class TestClinic {

	
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Doctor doctor=new Doctor();
		Doctor  d[]=new Doctor[2];
		String id=null;
		System.out.println("enter no of patients");
		int num=sc.nextInt();
		for(int i=0;i<d.length;i++) {
		System.out.println("Enter doctor id");
		 id=sc.next();
		System.out.println("Enter Doctor name");
		String name=sc.next();
		d[i]=new Doctor(id,name);
		
		
		
		
		for(int j=0;j<num;j++) {
			System.out.println("enter appointment id");
			int id1=sc.nextInt();
			System.out.println("enter date");
			String date =sc.next();
			Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(date);
			
			doctor.addappointment(new Appointment(id1,num,date1));
			
			
		}
		System.out.println("enter docotor id for list");
		String doctorid=sc.next();
		
		try {
		
		if(doctorid==id) {
			throw new DoctorIdException("Doctor Id Does Not Exists");
		}else {
			doctor.printAppointment();
			
		}
			
	
		}
		catch(DoctorIdException die) {
			System.out.println(die.getMessage());
		}
		
	}
		
		
}
}

