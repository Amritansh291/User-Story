package UserStory1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class objectscreate {

	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		File myDir=new File("program");
		myDir.mkdir();
		Patients ptt = new Patients("1009","Ankutt","heart");
		ObjectOutputStream oos=null;
		try {
			if(ptt.getDiseases().equals("headache")||ptt.getDiseases().equals("fever")||ptt.getDiseases().equals("cancer")||ptt.getDiseases().equals("heart")) {
		    if(ptt.getDiseases().equals("headache")) {
			oos=new ObjectOutputStream(new FileOutputStream("headache.txt"));
			oos.writeObject(ptt);
		    }
		    if(ptt.getDiseases().equals("fever")) {
				oos=new ObjectOutputStream(new FileOutputStream("fever.txt"));
				oos.writeObject(ptt);
			    }
		    if(ptt.getDiseases().equals("cancer")) {
				oos=new ObjectOutputStream(new FileOutputStream("cancer.txt"));
				oos.writeObject(ptt);
			    }
		    if(ptt.getDiseases().equals("heart")) {
				oos=new ObjectOutputStream(new FileOutputStream("heart.txt"));
				oos.writeObject(ptt);
				}
			oos.close();
			System.out.println("File Created");

			}
			else {
				throw new WrongFileException();
			}
		}
		catch(WrongFileException wfe) {
			System.out.println("Wrong File Exception");
		}
		finally {
			
		}
	}
}
