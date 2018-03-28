package contactApplication;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.swing.JOptionPane;

import java.io.BufferedWriter;
import java.io.File;


public abstract class ApplicationFunctions {

	private static final String DELIMETER=", ";		//comma separator
	private static final String NEWLINE ="\n";
	private static final String CSVHEADING ="first_name, last_name , phoneNum, email_address, cell_Number, facebook_url, twitter_url, image_path ";
	private static final File FILENAME = new File("contact.csv");
	
	public static void save() {
		
		try	
		{
		
			
			FileWriter fileWriter = new FileWriter(FILENAME,true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			PrintWriter pw = new PrintWriter(bw);     //gives access to system.out
			
			pw.flush();
			pw.close();
			JOptionPane.showMessageDialog(null, "record saved");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void delete(String Name) {
		
	}
	
	public static void edit() {
		
	}
	
	public static void search() {
		
	}
	
}
