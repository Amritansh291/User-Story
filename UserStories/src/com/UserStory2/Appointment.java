package com.UserStory2;

import java.util.Date;

public class Appointment {

	
	
	private int appId;
	private Date appDate;
	private int noOfPatients;
	public Appointment(int appId, int noOfPatients, Date appDate) {
		this.appId=appId;
		this.noOfPatients=noOfPatients;
		this.appDate=appDate;
	}

	public int getAppId() {
		return appId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public int getNoOfPatients() {
		return noOfPatients;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public void setNoOfPatients(int noOfPatients) {
		
		try {
			if(noOfPatients<1 && noOfPatients>15) {
				throw new InvalidNoOfPatientsException("InvalidNoOfPatientsException");
			}
			else {
				this.noOfPatients = noOfPatients;
			}
		}
		catch(InvalidNoOfPatientsException iie) {
			System.out.println(iie.getMessage());
		}
	}
	@Override
	public String toString(){
		return appId+" "+noOfPatients+" "+appDate;
	}
	
	
	
	
}
