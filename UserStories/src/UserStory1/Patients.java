package UserStory1;




import java.io.Serializable;
public class Patients implements Serializable{
		
	private String patientId;
	private String patientName;
	private String diseases;
	
	public Patients(String patientId, String patientName, String diseases){
		this.patientId=patientId;
		this.patientName=patientName;
		this.diseases=diseases;
	}
	
	public String getPatientId() {
		return patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public String toString() {
		return "Id:-"+patientId+"\n"+"Patient Name:-"+patientName+"\n"+"Disease:-"+diseases;
	}
	

}
