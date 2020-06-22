package UserStory1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readingData {

	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//ObjectInputStream ois =new ObjectInputStream(new FileInputStream("headache.txt"));
		//ObjectInputStream ois1 =new ObjectInputStream(new FileInputStream("fever.txt"));
		//ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("cancer.txt"));
		ObjectInputStream ois3 =new ObjectInputStream(new FileInputStream("heart.txt"));
		//Patients ptt=(Patients) ois.readObject();
		//Patients ptt1=(Patients) ois1.readObject();
		//Patients ptt2=(Patients) ois2.readObject();
		Patients ptt3=(Patients) ois3.readObject();
		//System.out.println(ptt1);
		//System.out.println(ptt2);
		System.out.println(ptt3);
		//System.out.println(ptt);
		//ois.close();
		//ois1.close();
		//ois2.close();
		ois3.close();
	}
}
