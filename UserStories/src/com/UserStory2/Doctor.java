package com.UserStory2;

import java.util.ArrayList;

public class Doctor {
	
	
	
	
	
	
	
	
	private String docId;
	private String docName;
	private ArrayList<Appointment> lists=new ArrayList<Appointment>();
	
	
	
	
	
	

	
	
	

	
	
    
	public Doctor(String id, String name) {
		this.docId=id;
		this.docName=name;
	}
	public Doctor() {
	}
	
	public void addappointment(Appointment appoint) {
		lists.add(appoint);
		
	}
    public void printAppointment() {
    	for(Appointment alp:lists) {
    		System.out.println(alp);
    	}
		
	}

}
